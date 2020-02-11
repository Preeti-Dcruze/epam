package com.PreetiDcruze.Calculator.InputReader;

import com.PreetiDcruze.Calculator.*;
import java.util.Scanner;

public class InputReader {
	static Scanner sc;

	public InputReader() {
		sc = new Scanner(System.in);
	}

	static int readFirstNumber() {
		return sc.nextInt();
	}

	static int readSecondNumber() {
		return sc.nextInt();
	}

	public void performOperation() {
		int num1 = 0;
		int num2 = 0;
		int choice = 0;
		String eflag=null;

		while (true) {
			System.out.println("Enter the first number ");
			num1 = readFirstNumber();
			System.out.println("Enter the second number");
			num2 = readSecondNumber();
			System.out.println("Select operation ot be performed");
			System.out.println("1 -- Addition operation (+)");
			System.out.println("2 -- Subtraction operation (-)");
			System.out.println("3 -- Multiplication operation (*)");
			System.out.println("4 -- Division operation (/)");
			System.out.println("5 -- Modulo Operation (%)");
			System.out.println("6 -- Power Operation (^)");
			//System.out.println("7 -- Exit ");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Addition add = new Addition();
				add.compute(num1, num2);
				break;
			case 2:
				Subtraction substract = new Subtraction();
				substract.compute(num1, num2);
				break;
			case 3:
				Multiplication multiplication = new Multiplication();
				multiplication.compute(num1, num2);
				break;
			case 4:
				Division division = new Division();
				division.compute(num1, num2);
				break;
			case 5:
				Modulo modulo = new Modulo();
				modulo.compute(num1, num2);
				break;
			case 6:
				Power pow = new Power();
				pow.compute(num1, num2);
				break;
			default:
				System.out.println("Please enter appopriate operation");
				break;
			}
			System.out.println("Do you wish to exit? Y/N");
			eflag=sc.next();
			if(eflag.equals("Y") || eflag.equals("y"))
			{
				System.out.println("Exiting....");
				System.exit(0);
			}
		}
	}

}
