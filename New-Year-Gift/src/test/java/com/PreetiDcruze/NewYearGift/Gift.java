package com.PreetiDcruze.NewYearGift;

abstract class Gift {

	private int price;
	private int weight;
	private String gift_type;

	Gift(int price, int weight, String gift_type) {
		this.price = price;
		this.weight = weight;
		this.gift_type = gift_type;
	}

	public int get_weight() {
		return weight;
	}

	public int get_price() {
		return price;
	}

	public String get_type() {
		return gift_type;
	}

	abstract void description();

	@Override
	public String toString() {
		return " Gift type:" + this.gift_type + "\n Price is " + this.price + "\n Weight is " + this.weight;
	}

}
