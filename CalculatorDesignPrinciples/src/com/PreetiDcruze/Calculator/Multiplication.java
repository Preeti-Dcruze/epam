package com.PreetiDcruze.Calculator;

public class Multiplication implements Calculator {

	@Override
	public void compute(int n1, int n2) {
		int prod = n1 * n2;
		System.out.println(n1 + " * " + n2 + " = " + prod);
	}

}