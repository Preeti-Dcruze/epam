package com.PreetiDcruze.Calculator;

public class Addition implements Calculator {

	@Override
	public void compute(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + sum);
	}

}