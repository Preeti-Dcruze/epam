import designpatternexample.Behavioural.*;
import designpatternexample.Creational.*;
import designpatternexample.Structural.*;
public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Main Driver !!!");
      
      System.out.println("Executing Creational Problems");
      System.out.println("Singleton Class");
	  SingletonClass singleton = SingletonClass.getInstance();
	  singleton.getInstance();
	  System.out.println("Builder Class");
	  House house = new House.HouseBuilder(3,4,5,true,true).build();
	  
	  
	  System.out.println("Executing Structural");
	  System.out.println("Adapter Classes");
	  
	  GermanConnector germanconnector = new GermanConnector() {
		
		public void giveElectricity() {
			// TODO Auto-generated method stub
			System.out.println("Given Electricity");
		}
		
		public void connected() {
		 System.out.println("Connected");
			
		}
	};
	UKSocket uksocket = new UKSocket();
	UKConnector ukadapter = new GermanToUKAdapter(germanconnector);
	uksocket.plugIn(ukadapter);
	System.out.println("Decorator classes");
	
	Car sportsCar = new SportsCar(new BasicCar());
	sportsCar.assemble();
	System.out.println("\n*****");
	
	
	System.out.println("Behavioral Classes");
	System.out.println();
	System.out.println("Interpreter Class");
	System.out.println();
	 Expression expression = new Expression("harish");
	 Expression expression1 = new Expression("Ritish");
	 
	 System.out.println();
	 PerformOr exor= new PerformOr(expression,expression1);
	 
	
	 System.out.println("Executing Mediator classes");
	  ChatRoomInterface chatroom = new Chatroom();
      System.out.println();
      User user1 = new ChatUser(chatroom,"1", "Alex");
      User user2 = new ChatUser(chatroom,"2", "Brian");
      User user3 = new ChatUser(chatroom,"3", "Charles");
      User user4 = new ChatUser(chatroom,"4", "David");
       System.out.println();
      chatroom.addUser(user1);
      chatroom.addUser(user2);
      chatroom.addUser(user3);
      chatroom.addUser(user4);
System.out.println();
      user1.send("Hello brian", "2");
      user2.send("Hey buddy", "1");
	 System.out.println();
	 
	} 

}
