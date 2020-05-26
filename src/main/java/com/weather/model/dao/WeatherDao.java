package com.weather.model.dao;

import java.util.List;

import com.weather.model.dto.WeatherDTO;

public interface WeatherDao {
	
	String NAMESPACE = "weather.";
	
	public List<WeatherDTO> weatherlist();
	public int insert (WeatherDTO dto);
}
