package com.PreetiDcruze.HouseConstructionEstimator;
public class PricingList implements CostEstimator{
	   
	    String materialStandard;
	    int totalArea;
	     PricingList(String material,int area)
	     {
	         materialStandard=material;
	         totalArea=area;
	     }

	    @Override
	    public int Estimate() {
	          int totalCost=0;

	        if(materialStandard.compareToIgnoreCase("standard")==0)
	        {
	            totalCost+=1200*totalArea;
	        }
	        else if(materialStandard.compareToIgnoreCase("above standard")==0)
	        {
	          totalCost+=1500*totalArea;
	        }
	        else if(materialStandard.compareToIgnoreCase("high standard")==0)
	        {
	          Scanner sc = new Scanner(System.in);
	         System.out.println("Do you need a fully automated one\nYes or No");
	         String choice = sc.next();
	         if(choice.equals("Yes") || choice.equals("Y"))
	            totalCost+=2500*totalArea;
	         else
	         totalCost+= 1800*totalArea;   
	        
	        }
	        return totalCost;
	    }
	    
	}
}
