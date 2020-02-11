package com.PreetiDcruze.Calculator;

public class Subtraction implements Calculator {

	@Override
	public void compute(int n1, int n2) {
		int diff = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = " + diff);
	}

}
