package com.converter.exchange;



public class ExchangeValue {
	
	private int id;
	private String from;
	private String to;
	private double exchangeRate;
	
	
	public  ExchangeValue() {
		
	}


	public ExchangeValue(String from, String to, double exchangeRate) {
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public double getExchangeRate() {
		return exchangeRate;
	}


	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}
