package com.PreetiDcruze.MavenProject;
class Cadburry extends Chocolates
{

    public Cadburry(int Chocolate_content, int weight, int price, String chocolate_name,String type) {
        super(Chocolate_content, weight, price, chocolate_name, type);

    }

    @Override
    void description() {
        System.out.println( "I am Cadburry");

    }
    
}