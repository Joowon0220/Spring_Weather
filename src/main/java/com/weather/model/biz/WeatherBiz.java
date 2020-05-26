package com.weather.model.biz;

import java.util.List;

import com.weather.model.dto.WeatherDTO;

public interface WeatherBiz {
	
	public List<WeatherDTO> weatherlist();
	public int insert (WeatherDTO dto);

}
