package com.PreetiDcruze.NewYearGift;

class Silk extends Chocolate
{

    
    public Silk(int Chocolate_content, int weight, int price, String chocolate_name,String type, String chocolate_brand) {
        super(Chocolate_content, weight, price, chocolate_name, type,chocolate_brand);

    }

    @Override
    void description() {
        System.out.println( "I am Silk from the brand Cadbury");

    }
}

