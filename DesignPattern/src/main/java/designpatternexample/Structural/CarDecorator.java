package designpatternexample.Structural;

public class CarDecorator implements Car{

	protected  Car c;
	
	public  CarDecorator(Car c) {
		// TODO Auto-generated method stub
		 this.c = c;
	}
 public void assemble() {
		// TODO Auto-generated method stub
		this.c.assemble();
	}
	
     
}
