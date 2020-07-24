package designpatternexample.Structural;

public class SportsCar extends CarDecorator {
          public SportsCar(Car c)
          {
        	  super(c);
          }
        public void assemble()
        {
        	super.assemble();
        	System.out.println("Assembling Sports Car\n");
        }
}
