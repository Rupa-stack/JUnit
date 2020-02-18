package com.cts.junit.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testMultiplyWithZero {

	@Test
	public void multiplicationWithZeroMustReturnZero()
	{
		Multiplication obj = new Multiplication();
		
		assertEquals("10 multiplied by zero must be zero",0,obj.multiply(10, 0));
		assertEquals("0 multiplied by ten must be zero",0,obj.multiply(0, 10));
		assertEquals("0 multiplied by zero must be zero",0,obj.multiply(0, 0));
		
	}

}
