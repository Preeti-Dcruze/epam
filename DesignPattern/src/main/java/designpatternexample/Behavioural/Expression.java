package designpatternexample.Behavioural;

public class Expression implements Interpreter{
	 String data; 
	  
	    public Expression(String data) 
	    { 
	        this.data = data;  
	    } 
	  
	 

		public boolean interpret(String s) {
			// TODO Auto-generated method stub

	        if(s.contains(data)) 
	        { 
	            return true; 
	        } 
	        else
	        { 
	            return false;   
	        } 
		} 
}
