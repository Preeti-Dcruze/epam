package com.PreetiDcruze.MavenProject;
public class Kheer extends Sweets
{

    public Kheer(int sugar_content, int weight, int price, String sweetname,String type) {
     
        super(sugar_content, weight, price, sweetname,type);
       
    }

    @Override
    void description() {
      System.out.println("I am Kheer and I like to be in Green Colour");
        
    }

}
