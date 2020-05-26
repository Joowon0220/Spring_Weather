package com.weather.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weather.model.biz.WeatherBiz;
import com.weather.model.dto.WeatherDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private WeatherBiz biz;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {워니월드}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/list.do")
	public String list (Model model) {
		logger.info("weather select List");
		
		model.addAttribute("list", biz.weatherlist());
		
		return "list";
	}
	
	
	@RequestMapping(value = "/insertform.do")
	public String insertform() {
		return "insert";
	}
	
	@RequestMapping(value = "/insertres.do", method = RequestMethod.POST)
	public String insertRes(WeatherDTO dto) {
		logger.info("insert 성공");
		
		int res = biz.insert(dto);
		
		if(res > 0) {
			return "redirect:list.do";
		} else {
			return "redirect:insertform.do";
		}
	}
	
}
