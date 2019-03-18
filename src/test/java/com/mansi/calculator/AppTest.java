package com.mansi.calculator;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;

import org.junit.Test;
import com.mansi.calculator.services.CalculatorImplementation;

/**
 * 
 * Unit test for simple App.
 * 
 */

public class AppTest

{
	private static App app;

	/**
	 * 
	 * Setting up instance of the class
	 * 
	 * @throws Exception
	 * 
	 */

	@BeforeClass

	public static void BeforeClass() throws Exception {

		app = new App(new CalculatorImplementation());

	}

	/**
	 * 
	 * Test method to test the addition of two numbers
	 * 
	 */

	@Test

	public void Addition() {

		assertEquals(11.0, app.calculation(1), 0.0);

	}

	/**
	 * 
	 * Test method to test the multiplication of two numbers
	 * 
	 */

	@Test

	public void Multiplication() {

		assertEquals(42.0, app.calculation(2), 0.0);

	}

	/**
	 * 
	 * Test method to test the division of two numbers
	 * 
	 */

	@Test

	public void Division() {

		assertEquals(2.0, app.calculation(3), 0.0);

	}

}