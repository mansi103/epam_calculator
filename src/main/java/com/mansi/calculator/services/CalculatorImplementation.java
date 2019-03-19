package com.mansi.calculator.services;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorImplementation implements CalculatorServices {

	@Override
	public double addition(double number1, double number2) {
		double sumNumbers = 0;
		sumNumbers = number1 + number2;
		return sumNumbers;
	}

	@Override
	public double multiplication(double number1, double number2) {
		double productNumbers = 1;
		productNumbers = number1 * number2;
		return productNumbers;
	}

	@Override
	public double division(double number1, double number2) {
		Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		double divisionResult = 0.0;

		try {
			divisionResult = number1 / number2;
		} catch (ArithmeticException ae) {
			LOGGER.log(Level.INFO, "Division by zero not possible");
		}
		return divisionResult;
	}

}
