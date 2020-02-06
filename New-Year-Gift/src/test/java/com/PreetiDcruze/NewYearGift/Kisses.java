package com.PreetiDcruze.NewYearGift;

class Kisses extends Chocolate {

	public Kisses(int Chocolate_content, int weight, int price, String chocolate_name, String type,
			String chocolate_brand) {
		super(Chocolate_content, weight, price, chocolate_name, type, chocolate_brand);

	}

	@Override
	void description() {
		System.out.println("I am Kisses from the brand Herseys");

	}
}