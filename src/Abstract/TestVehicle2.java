package Abstract;

abstract class Vehicle2 {
	
	  int no_of_tyres;
	  
	  abstract void start();
	  
	  abstract void stop();
}
abstract class Car2 extends Vehicle {
	
	void start()
	{
		System.out.println("Car Starts");
	}
  abstract void stop();
  /* {
	  System.out.println("Car Stops");
  } */
  abstract void openDoor();
  
}
class Hyundai extends Car2 // class bike must implement all the inherited abstract methods.
{
	
	void stop()
	{
		System.out.println("Hyundai Stops");
	}
	void openDoor()
	{
		System.out.println("Hyundai Sliding");
	}
}
	
	 
class TestVehicle2 {
	public static void main(String[] args) {
		
	/* 	Car2 c = new Car2(); // Abstract class cannot be instantiated
		c.start();
		c.stop(); */ 
		
	//	Vehicle v = new Vehicle(); // Abstract Class cannot be instantiated.
		
		/* Vehicle v  = new Car2();  // Abstract Class cannot be instantiated.
		v.start();
		v.stop();  */
		
		Car2 v2 = new Hyundai(); // // Abstraction is used to implement overriding.
		v2.start();
		v2.stop();
		v2.openDoor();
		
		
				
		// TODO Auto-generated method stub

	}

}
