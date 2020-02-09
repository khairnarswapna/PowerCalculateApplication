package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.ValueDTO;
import com.demo.service.PowerCalculatorService;

@RequestMapping("/powercalculator")
@RestController
public class PowerCalculatorController {
	@Autowired
	PowerCalculatorService service;

	@PostMapping("/compute")
	public int registration(@RequestBody ValueDTO valueDTO) {
		System.out.println("--------in controller--------");
		int response = service.calculate(valueDTO);
		return response;
	}

}
