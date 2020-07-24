package designpatternexample.Behavioural;

public class PerformOr implements Interpreter{

 private Interpreter interpreter1;
 private Interpreter interpreter2;
	public boolean interpret(String s) {
		// TODO Auto-generated method stub
		return  interpreter1.interpret(s) || interpreter2.interpret(s);
	}
	public PerformOr(Interpreter s1,Interpreter s2)
	{
	interpreter1=s1;
	interpreter2=s2;
	}
	
}
