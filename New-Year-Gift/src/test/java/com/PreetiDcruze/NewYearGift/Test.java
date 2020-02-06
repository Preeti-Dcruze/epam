
package com.PreetiDcruze.NewYearGift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Test {
	static int get_totalweight(ArrayList<Gift> al) {
		int totalweight = 0;
		for (Gift i : al) {
			totalweight += i.get_weight();
		}
		return totalweight;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int calories = 0;
		int weight = 0;
		int price = 0;
		String sweetname = "";
		String sweettype = "";
		int chocolatecontent = 0;
		int choco_weight = 0;
		int choco_price = 0;
		String Choco_name = "";
		String Choco_brand = "";
		String type = "";

		System.out.println("Enter the number of gifts");
		int n = sc.nextInt();
		ArrayList<Gift> list = new ArrayList<Gift>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the type of Gift "+(i+1));
			type = sc.next();
			if (type.equals("Chocolate")) {
				System.out.println("Enter the chocolate content");
				chocolatecontent = sc.nextInt();
				System.out.println("Enter the weight ");
				choco_weight = sc.nextInt();
				System.out.println("Enter the price ");
				choco_price = sc.nextInt();
				System.out.println("Enter the Chocolate name");
				Choco_name = sc.next();
				System.out.println("Enter the Chocolate brand");
				Choco_brand = sc.next();

				if (Choco_name.equals("Silk")) {
					Silk c = new Silk(chocolatecontent, choco_weight, choco_price, Choco_name, type, Choco_brand);
					list.add(c);
				} else if (Choco_name.equals("Kisses")) {
					Kisses f = new Kisses(chocolatecontent, choco_weight, choco_price, Choco_name, type, Choco_brand);
					list.add(f);
				} else {
					Melody g = new Melody(chocolatecontent, choco_weight, choco_price, Choco_name, type, Choco_brand);
					list.add(g);
				}

			} else {
				System.out.println("Enter the calories of " + type);
				calories = sc.nextInt();
				System.out.println("Enter the weight ");
				weight = sc.nextInt();
				System.out.println("Enter the price ");
				price = sc.nextInt();
				System.out.println("Enter the sweetname");
				sweetname = sc.next();
				System.out.println("Enter the sweettype");
				sweetname = sc.next();
				if (sweetname.equals("KajuBarfi")) {
					KajuBarfi g = new KajuBarfi(calories, weight, price, sweetname, type, sweettype);
					list.add(g);
				} else if (sweetname.equals("MotiChoor")) {
					MotiChoor h = new MotiChoor(calories, weight, price, sweetname, type, sweettype);
					list.add(h);
				} else {
					Rasagulla k = new Rasagulla(calories, weight, price, sweetname, type, sweettype);
					list.add(k);
				}
			}
		}

		int totalweight = get_totalweight(list);
		System.out.println("The Total Weight is " + totalweight);

		Collections.sort(list, new Sorter());
		System.out.println("After Sorting the Chocolates based on Weights");
		for (Gift c : list) {
			if (c.get_type().equals("Chocolate"))
				System.out.println(c);
		}

		System.out.println("Enter the min value for range of weights");
		int min = sc.nextInt();
		System.out.println("Enter the max value for range of weights");
		int max = sc.nextInt();
		System.out.println("Gifts in the range ");
		for (Gift g : list) {
			if (g.get_weight() >= min && g.get_weight() <= max) {
				System.out.println(g);
			}
		}

		sc.close();

	}
}
