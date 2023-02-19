package com.limit.limitconiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("limit.service")
public class Limits {
	private  int maximum;
	private  int minimum;
	public Limits(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public Limits() {
		
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	


}
