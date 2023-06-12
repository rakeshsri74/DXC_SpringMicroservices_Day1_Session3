package com.dxc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Weather;

@RestController
public class WeatherController {

	@GetMapping("/today")
	public Weather getWeather() {
		Weather weather = new Weather();
		weather.setHumidity(12.23);
		weather.setTemp(23.89);
		weather.setWindspeed(98.78);
		return weather;
	}
}
