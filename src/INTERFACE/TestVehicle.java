package INTERFACE;

interface Vehicle {
	
	int price = 100;
	 void start();  // an interface class contains empty methods, a class which implements interface class
	                 /// must provide the implementation of all the interface methods.
	 
	 void stop();
	 
	   
}
class Car implements Vehicle {
	
	 public  void start() // all members in interface are public, static, final by default. so we need to use access 
	  // specifier as public.
	   {
		   System.out.println("Car Starts..........");
	   }
	 
	 public void stop()
	 {
		 System.out.println("Car Stops..............");
	 }
}
public class TestVehicle {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
	//	c.price = 2000; this is final field in Vehicle(Non- changeable). hence cannot be assigned or altered.
		System.out.println(c.price);  
		 /// price is static and hence sharable, so all classes implementing the vehicle can access its data members
		// as they are public and final , neither of the class implementing the interface class vehicle can change its value.
		
		Vehicle v = new Car();// upcasting
		v.start();
		v.stop();
		// TODO Auto-generated method stub

	}

}
