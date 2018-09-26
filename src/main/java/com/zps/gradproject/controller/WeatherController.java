package com.zps.gradproject.controller;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.Weather;
import com.zps.gradproject.service.Impl.WeatherServiceImpl;
import com.zps.gradproject.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zps
 * @date 2018/9/25 17:17
 **/
@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping("/weather")
    private Commes<Weather> weather(String city){
        return weatherService.weather(city);
    }


}
