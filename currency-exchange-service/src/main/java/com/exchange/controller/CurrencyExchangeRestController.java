package com.exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exchange.dao.ExchangeValueRepository;
import com.exchange.exchangevalue.ExchangeValue;

@RestController
public class CurrencyExchangeRestController {
	@Autowired
	private ExchangeValueRepository exchangeValueDAO;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue exchangeValue(@PathVariable String from ,@PathVariable String to) {
		
		
		return  exchangeValueDAO.findByFromAndTo(from, to);
	}

}
