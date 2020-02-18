package com.cts.junit.testing;

import org.junit.FixMethodOrder;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(testMultiplyWithZero.class,testDivisionByZero.class);
		System.out.println(result.getFailureCount());
		System.out.println(result.getRunTime());
		System.out.println(result.getRunCount());
		System.out.println(result.wasSuccessful());
		for(Failure failure: result.getFailures())
		{
			System.out.println(failure.toString());
		}
		
	}
}
