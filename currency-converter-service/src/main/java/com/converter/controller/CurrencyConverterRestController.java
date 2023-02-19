package com.converter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.converter.currencyconversion.CurrencyConversion;
import com.converter.exchange.ExchangeValue;

@RestController
public class CurrencyConverterRestController {
	

	@Autowired
	private RestTemplate restTemplate;
	
	
	
	//using feign
	@GetMapping("/currency-exchange/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion feignCurrencyConversion(@PathVariable String from,@PathVariable String to,@PathVariable double quantity) {
		ExchangeValue exchangeValue=restTemplate.getForObject("http://CURRENCY-EXCAHNGE-SERVICE/currency-exchange/from/"+from+"/to/"+to,ExchangeValue.class);
		return new CurrencyConversion(exchangeValue.getFrom(),exchangeValue.getTo(),exchangeValue.getExchangeRate(),quantity);
	}
	

}
