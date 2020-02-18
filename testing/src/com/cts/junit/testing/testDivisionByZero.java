package com.cts.junit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDivisionByZero {

	@Test(expected=java.lang.ArithmeticException.class)
	//ArithmeticException arises only for int type
	public void test() {
		Division obj= new Division();
		//obj.divide(10,0);
		assertEquals("divide by zero gives infinity",true,Float.isInfinite(obj.divide(10, 0)));
	}

}
