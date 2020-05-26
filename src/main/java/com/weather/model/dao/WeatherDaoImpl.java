package com.weather.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weather.model.dto.WeatherDTO;

@Repository
public class WeatherDaoImpl implements WeatherDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<WeatherDTO> weatherlist() {
		List<WeatherDTO> list = new ArrayList<WeatherDTO>();

		try {
			list = sqlSession.selectList(NAMESPACE+"selectlist");
			System.out.println(list.size());
		} catch (Exception e) {
			System.out.println("[error]: selectlist");
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int insert(WeatherDTO dto) {
		int res=0;
		
		try {
			res=sqlSession.insert(NAMESPACE+"insert",dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[error] : insert");
		}
		return res;
	}

}
