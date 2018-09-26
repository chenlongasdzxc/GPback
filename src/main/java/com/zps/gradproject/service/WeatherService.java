package com.zps.gradproject.service;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.Weather;

/**
 * @author Zps
 * @date 2018/9/26 16:51
 **/
public interface WeatherService {

    Commes<Weather> weather(String city);
}
