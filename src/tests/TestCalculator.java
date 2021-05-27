package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import kalkulatorWalut.Calculator;

/*
 * @author Julia Zielonka
 * 
 * TestCalculator
 *
 * 26.05.2021
 * 
 */

public class TestCalculator {
	
	//test the convertion.
	@Test
	public void testConvert() {
		
		Calculator.convert(3.75, "PLN");
		
		double result = Calculator.convert(3.75, "PLN");
		
		Assertions.assertEquals(16.81875, result);
	}
	
	//test the convertion ignoring case.
	@Test 
	public void testConvertIgonreCase() {
		
		double result = Calculator.convert(6.7, "aud");
		
		Assertions.assertEquals(10.58868, result);
	}
	
}
