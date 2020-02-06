package com.PreetiDcruze.NewYearGift;

public abstract class Sweets extends Gift {
	private int weight;
	private int calories;
	private int price;
	private String Sweets_name;
	private String Sweets_type;
	private String gift_type;

	public Sweets(int calories, int weight, int price, String Sweets_name, String gift_type, String Sweets_type) {
		super(price, weight, gift_type);
		this.Sweets_name = Sweets_name;
		this.calories = calories;
		this.weight = weight;
		this.price = price;
		this.Sweets_type = Sweets_type;
		this.gift_type = gift_type;
	}

	public int get_calories() {
		return calories;
	}

	public String get_type() {
		return gift_type;
	}

	public int get_weight() {
		return weight;
	}

	public String get_Sweets_name() {
		return Sweets_name;
	}

	public String get_Sweets_type() {
		return Sweets_type;
	}

	abstract void description();

	public String toString() {

		return " Sweets name: " + this.Sweets_name + "\n" + " Calories: " + this.calories + "\n" + " Sweets price: "
				+ this.price + "\n" + " Sweets weight: " + this.weight + "\n";
	}
}