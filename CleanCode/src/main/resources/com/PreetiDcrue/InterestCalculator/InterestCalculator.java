package com.PreetiDcruze.InterestCalculator;

import java.util.*;

public class InterestCalculator implements InterestCalculator {
	Scanner scanner;
	int principalAmount;
	int rateOfInterest;
	int termOfLoan;

	InterestCalculator()
    {
        scanner = null;
        principalAmount = 0;
        rateOfInterest = 0;
        termOfLoan = 0;
    }

	@Override
	public float calculateSimpleInterest() {
		float simpleInterest = (principalAmount * ((float) rateOfInterest / 100) * termOfLoan) / 100;
		return simpleInterest;
	}

	@Override
	public double calculateCompoundInterest() {
		double compoundInterest = (double) (principalAmount * (Math.pow((1 + (double) rateOfInterest / 100), termOfLoan)))
				- principalAmount;
		return compoundInterest;
	}

	@Override
	public void readInput() {
		scanner = new Scanner(System.in);
		System.out.println("Enter the principal amount ");
		principalAmount = scanner.nextInt();
		System.out.println("Enter the rate of interest ");
		rateOfInterest = scanner.nextInt();
		System.out.println("Enter the term of loan");
		termOfLoan = scanner.nextInt();
	}

}