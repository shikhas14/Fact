package com.yash.FactorialofNumber.pojo;

public class FactorialOfNumber {

	public int getFactorial(int input) {
		if(input>=0){
			int res=1;
			for(int i=input;i>0;i--)
				res*=i;
			return res;
		}
		else
			throw new RuntimeException("The entered number is negative");
		}
}
