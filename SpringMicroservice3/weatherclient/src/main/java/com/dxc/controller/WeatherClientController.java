package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dxc.model.Weather;

@RestController
public class WeatherClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/todayByClient")
	public Weather getWeatherByClient() {
		Weather weather = null;
		String url ="http://localhost:8091/today";
		try {
			weather = restTemplate.getForObject(url,Weather.class);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return weather;
	}
}
