package com.limit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limit.limitconiguration.Limits;

@RestController
public class LimitRestController {
	
	@Autowired
	private Limits limits;
	
	@GetMapping("/limits")
	public Limits limits() {
		return limits;
	}

}
