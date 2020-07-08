package com.cloudnative.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

	@GetMapping(path = "/limits")
	public LimitsConfiguration getLimitsConfiguration() {
		return new LimitsConfiguration(10, 100);
	}

}
