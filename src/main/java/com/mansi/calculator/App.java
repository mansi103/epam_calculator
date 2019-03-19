package com.mansi.calculator;

import com.mansi.calculator.services.CalculatorServices;

/**
 * Calculator
 *
 */
public class App {
	private CalculatorServices calculatorService;

	public App(CalculatorServices calculatorService) {

		this.calculatorService = calculatorService;

	}
	/**
	* if x==1 then do addition
	* if x==2 then do multiplication
	* else do division
	*/
	public double calculation(int x) {
		double answer = 0.0;
		if (x == 1) {
			answer = calculatorService.addition(5.0, 6.0);
		} else if (x == 2) {
			answer = calculatorService.multiplication(6.0, 7.0);
		} else {
			answer = calculatorService.division(200.0, 100.0);
		}
		return answer;
	}
}
