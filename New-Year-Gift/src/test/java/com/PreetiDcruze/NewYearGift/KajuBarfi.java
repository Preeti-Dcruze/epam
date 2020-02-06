package com.PreetiDcruze.NewYearGift;

public class KajuBarfi extends Sweets {
	
	    public KajuBarfi(int calories, int weight, int price, String sweetname,String type, String sweet_type) {
	        super(calories, weight, price, sweetname, type, sweet_type);
	    }

	    @Override
	    void description() {
	        System.out.println("I am Kaju Barfi and I am in the shape of a diamond");
	    }

}
