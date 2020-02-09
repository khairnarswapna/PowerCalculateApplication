package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.dto.ValueDTO;

@Service
public class PowerCalculatorService implements ICalculatorService {
	@Override
	public int calculate(ValueDTO numberDTO) {
		
		System.out.println("CalculatorService.calculate()");
		int baseValue = numberDTO.getBaseValue();
		int exponentValue = numberDTO.getExponentValue();

		System.out.println("base value:"+baseValue);
		System.out.println("power value:"+exponentValue);

		int resultValue = 1;

		for (int i = 1; i <= exponentValue; i++) {
			
			resultValue = resultValue * baseValue;
		}
		// TODO Auto-generated method stub
		System.out.println(resultValue);
		return resultValue;
	}

}
