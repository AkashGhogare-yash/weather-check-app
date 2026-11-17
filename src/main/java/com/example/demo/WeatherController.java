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
	
	@GetMapping("/check2")
	public String getWeather2() {
		return "Weather is Cloudy";
	}

	@GetMapping("/check")
	public String getWeather1() {
		return "Weather is Sunny";
	}

	@GetMapping("/check5")
	public String getWeather5() {
		return "Weather is Sunny";
	}
	
	@GetMapping("/check6")
	public String getWeather6() {
		return "Weather is Sunny";
	}

}
