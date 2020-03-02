package Abstract;


abstract class Vehicle3 {
	String type;

	 Vehicle3()
	 {
		 System.out.println("Inside Vehicle class Constructor");
	 }
	 abstract void start();
	final  void gearChange()  // final methods cannot be overridden. However, they can be inherited.
	 {
		 System.out.println("Gear Changed@@@@@@@@@");
	 }
	abstract void stop();
	
}		
class Car3 extends Vehicle3 {
	
	void start()
	{
		System.out.println("Car Started##########");
	}
		
	void stop()
	{
		System.out.println("Car Stopped!!!!!!!!!!");
	}
	
}
	 
 class TestVehicle3 {

	public static void main(String[] args) {
		  Vehicle3 v = new Car3();
		  v.start();
		  v.stop();
		  v.gearChange();  //final methods can be inherited but cannot be overridden.
	}


	}


