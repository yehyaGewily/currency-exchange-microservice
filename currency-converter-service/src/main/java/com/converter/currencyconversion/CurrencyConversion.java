package com.converter.currencyconversion;


public class CurrencyConversion {

	private int id;
	private String from;
	private String to;
	private double exchangeRate;
	private double quantity;
	private double totalAmount;
	public CurrencyConversion(){
		
	}
	
	
	public CurrencyConversion(String from, String to, double exchangeRate, double quantity) {
		
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
		this.quantity = quantity;
		this.totalAmount=exchangeRate*quantity;
		
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
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	
}
