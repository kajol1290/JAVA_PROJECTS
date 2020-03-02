package Abstract;

abstract class Vehicle {
	
	  int no_of_tyres;
	  
	  abstract void start();
	  
	  abstract void stop();
}
class Car extends Vehicle {
	
	void start()
	{
		System.out.println("Car Starts");
	}
  void stop()
  {
	  System.out.println("Car Stops");
  }
}
class Bike extends Vehicle  // class bike must implement all the inherited abstract methods.
{
	
	void start()
	{
		System.out.println("Bike Start");
	}
	void stop()
	
	{
		System.out.println("Bike Stop");
	}
}
	
	 
class TestVehicle {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		c.stop();
		
	//	Vehicle v = new Vehicle(); // Abstract Class cannot be instantiated.
		
		Vehicle v  = new Car(); // Abstraction is used to implement overriding.
		v.start();
		v.stop();
		
		Vehicle v2 = new Bike();
		v2.start();
		v2.stop();
		
		
				
		// TODO Auto-generated method stub

	}

}
