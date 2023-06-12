package com.dxc.model;

public class Weather {

	private double temp;
	private double humidity;
	private double windspeed;
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}
	@Override
	public String toString() {
		return "Weather [temp=" + temp + ", humidity=" + humidity + ", windspeed=" + windspeed + "]";
	}
	
	
}
