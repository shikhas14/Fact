package com.yash.FactorialofNumber.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialOfNumberTest {
	@Test
	public void singlePositiveIntegerReturningSum() throws Exception {
		FactorialOfNumber Factorial=new FactorialOfNumber();
		int res=Factorial.getFactorial(5);
		assertEquals(120, res);
	}
	
	@Test
	public void zeroAsInputReturningOne() throws Exception {
		FactorialOfNumber Factorial=new FactorialOfNumber();
		int res=Factorial.getFactorial(0);
		assertEquals(1, res);
	}
	
	@Test(expected=RuntimeException.class)
	public void negativeNumberAsInputReturningOne() throws Exception {
		FactorialOfNumber Factorial=new FactorialOfNumber();
		Factorial.getFactorial(-1);
	}
}
