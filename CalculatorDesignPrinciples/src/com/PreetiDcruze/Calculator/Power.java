package com.PreetiDcruze.Calculator;

public class Power implements Calculator
{

    @Override
    public void compute(int n1, int n2) {
        int expo = (int) Math.pow(n1, n2);
        System.out.println(n1+" ^ "+n2+" = "+expo);
    }

}
