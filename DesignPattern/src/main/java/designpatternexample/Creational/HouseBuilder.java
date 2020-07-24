package designpatternexample.Creational;

public class HouseBuilder {
     
	private int numberOfWindows;
	private int numberOfDoors;
	private int numberOfRooms;
	private boolean hasSwimmingPool;
	private boolean hasGarden;
	
	public HouseBuilder()
	{
		numberOfDoors=0;
		numberOfRooms=0;
		numberOfWindows=0;
		hasGarden=false;
		hasSwimmingPool=false;
	}
	
	HouseBuilder(int numberOfWindows,int numberOfDoors,int numberOfRooms,boolean hasGarden,boolean hasSwimmingPool)
	{
		this.numberOfDoors=numberOfDoors;
		this.numberOfRooms=numberOfRooms;
		this.numberOfWindows=numberOfWindows;
		this.hasGarden=hasGarden;
		this.hasSwimmingPool=hasSwimmingPool;
	}

	
	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}

	

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}


	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}


	public void setHasGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
	}

	
	public House build()
	{
		return new House(numberOfDoors,numberOfWindows,numberOfRooms,hasGarden,hasSwimmingPool);
	}
	
	
}
