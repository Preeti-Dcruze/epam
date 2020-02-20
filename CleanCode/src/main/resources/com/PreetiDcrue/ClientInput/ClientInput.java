package com.PreetiDcruze.ClientInput;

import java.util.*;

import javax.print.attribute.standard.PrinterLocation;

import com.PreetiDcruze.InterestCalculator;
import com.PreetiDcruze.HouseConstructionEstimator;

class MainRunner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 --- Compound and Simple Interest");
			System.out.println("2 --- Estimate Cost for House Construction");
			System.out.println("3 --- Exit");

			switch (sc.nextInt()) {
			case 1:
				InterestCalculator interestCalculator = new InterestCalculator();
				interestCalculator.readInput();
				float simpleInterest = interestCalculator.calculateSimpleInterest();
				double compoundInterest = interestCalculator.calculateCompoundInterest();
				break;
				
			case 2:
				InputReader inputReader = new InputReader();
				inputReader.readInput();
				String standard = inputReader.getStandard();
				int totalArea = inputReader.getTotalArea();
				PricingList estimatePrice = new PricingList(standard, totalArea);
				int estimatedCost = estimatePrice.Estimate();
				break;
				
			case 3:
				System.exit(0);
				
			default:
				System.out.println("Please enter valid option");
				break;

			}
		}

	}
}