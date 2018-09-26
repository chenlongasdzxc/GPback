package com.zps.gradproject.service.Impl;

import cn.hutool.http.HttpRequest;
import com.zps.gradproject.service.WeatherService;
import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.Weather;
import com.zps.gradproject.repository.CityCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

import java.util.HashMap;

import java.util.Map;

/**
 * @author Zps
 * @date 2018/9/25 16:46
 **/
@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private CityCodeRepository cityCodeRepository;
    @Value("${key}")
    private String key;
    @Value("${weatherAPI}")
    private String path;
    Map<String,Object> querys =new HashMap<String, Object>();

    public Commes weather(String city){
        try {
            Weather weather = cityCodeRepository.findByName(city);
            Long adcode = weather.getAdcode();
            querys.put("city",adcode);
            querys.put("key",key);
            /*String result =HttpUtil.get("https://restapi.amap.com/v3/weather/weatherInfo",querys);*/
            String result =HttpRequest.get("https://restapi.amap.com/v3/weather/weatherInfo")
                    .form(querys)
                    .execute().body();
            return Commes.success(result);
        }catch (Exception e){
            e.printStackTrace();
            return Commes.errorMes("500","查找失败");
        }
    }


}
