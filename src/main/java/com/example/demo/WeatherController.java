package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/weather")
public class WeatherController {
	
	
	@GetMapping("/check")
	public String getWeather() {
		return "Weather is Cloudy";
	}

	@GetMapping("/check")
	public String getWeather1() {
		return "Weather is Sunny";
	}

}
