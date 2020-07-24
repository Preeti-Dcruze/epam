package designpatternexample.Creational;

public class House {
	private int numberOfWindows;
	private int numberOfDoors;
	private int numberOfRooms;
	private boolean hasSwimmingPool;
	private boolean hasGarden;
	
	public House() {
		// TODO Auto-generated constructor stub
		numberOfDoors=0;
		numberOfRooms=0;
		numberOfWindows=0;
		hasGarden=false;
		hasSwimmingPool=false;
	}
	public House(int numberOfDoors,int numberOfWindows,int numberOfRooms,boolean hasGarden, boolean hasSwimmingPool) {
		// TODO Auto-generated constructor stub
		this.numberOfDoors=numberOfDoors;
		this.numberOfRooms=numberOfRooms;
		this.numberOfWindows=numberOfWindows;
		this.hasGarden=hasGarden;
		this.hasSwimmingPool=hasSwimmingPool;
	}
	public int getNumberOfWindows() {
		return numberOfWindows;
	}
	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public boolean isHasSwimmingPool() {
		return hasSwimmingPool;
	}
	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}
	public boolean isHasGarden() {
		return hasGarden;
	}
	public void setHasGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
	}
	public static class HouseBuilder {
	     
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
		
		public HouseBuilder(int numberOfWindows,int numberOfDoors,int numberOfRooms,boolean hasGarden,boolean hasSwimmingPool)
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

	
	
}
