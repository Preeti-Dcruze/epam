package com.PreetiDcruze.NewYearGift;

public class Rasagulla extends Sweets {
	
	    public Rasagulla(int calories, int weight, int price, String sweetname,String type, String sweet_type) {
	        super(calories, weight, price, sweetname, type, sweet_type);
	    }

	    @Override
	    void description() {
	        System.out.println("I am Rasagulla and I am in the shape of a ball");
	    }

}
