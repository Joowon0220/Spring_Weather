package com.weather.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.model.dao.WeatherDao;
import com.weather.model.dto.WeatherDTO;


@Service
public class WeatherBizImpl implements WeatherBiz {
	
	@Autowired
	private WeatherDao dao;
	
	@Override
	public List<WeatherDTO> weatherlist(){
		return dao.weatherlist();
	}
	
	
	@Override
	public int insert (WeatherDTO dto) {
		return dao.insert(dto);
	}
}
