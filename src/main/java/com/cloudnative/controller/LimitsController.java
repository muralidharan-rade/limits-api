package com.cloudnative.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

	@Autowired
	private LimitsConfiguration config;

	@GetMapping(path = "/limits")
	public LimitsConfigurationBean getLimitsConfiguration() {
		return new LimitsConfigurationBean(config.getMin(), config.getMax());
	}

}
