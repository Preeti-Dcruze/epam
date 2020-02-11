package com.PreetiDcruze.Calculator;

public class Division implements Calculator {

	@Override
	public void compute(int n1, int n2) {
		int quot = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + quot);
	}

}