package com.PreetiDcruze.Calculator;

public class Modulo implements Calculator {

	@Override
	public void compute(int n1, int n2) {
		int modulo = n1 % n2;
		System.out.println(n1 + " % " + n2 + " = " + modulo);
	}

}
