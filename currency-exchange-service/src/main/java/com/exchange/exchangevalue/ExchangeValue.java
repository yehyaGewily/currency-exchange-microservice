package com.exchange.exchangevalue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exchange_value")
public class ExchangeValue {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	@Column(name="exchange_rate")
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
