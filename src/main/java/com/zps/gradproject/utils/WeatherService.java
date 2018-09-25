package com.zps.gradproject.utils;

import cn.hutool.http.HttpRequest;
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
public class WeatherService {

    @Autowired
    private CityCodeRepository cityCodeRepository;
    @Value("${key}")
    private String key;
    @Value("${weatherAPI}")
    private String path;

    public Commes weather(String city){
        Map<String,Object> querys =new HashMap<String, Object>();
        try {
            Weather weather = cityCodeRepository.findByMergerName(city);
            Long adcode = weather.getCityCode();
            querys.put("adcode",adcode);
            querys.put("key",key);
            String result =HttpRequest.post(path)
                    .form(querys).execute().body();
            return Commes.success(result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
