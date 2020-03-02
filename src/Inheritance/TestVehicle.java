package Inheritance;

class Vehicle {
	  
	  int wheels;
	  long price;
	  void start()
	  {
		  System.out.println("Vehicle Start");
	  }
	  void stop()
	  {
		  System.out.println("Vehicle Stop");
	  }
	  
}
class Car extends Vehicle {
	  
	  // int type;
	  Car (long p, int w)
	  {
		   price = p;
		   wheels=w;
	  
		   System.out.println("Price of Car= " +price);
		   System.out.println("No of wheels of car= "+wheels);
	   }
	   
	 
   void display(){
	   System.out.println("Car extends Vehicle");
   }
}
 class Truck extends Vehicle {
	   
	   
	    Truck (long p, int w)
	    {
	    	price=p;
	    	wheels=w;
	    	System.out.println("Price Range of Truck = "+price);
	    	System.out.println("No of wheels of a Truck = "+wheels);
	    }
	       
 }
 
 class Bus extends Vehicle
  // int cost;
 {
	  
	   Bus(long p, int w)
	   {
		     price = p;
		     wheels = w;
		     System.out.println("No of wheels of Bus = " +wheels);
		     System.out.println("Price range of Bus = " +price);
	   }
 }
 
 class Hyundai extends Car
 {
	   String color;
	   String  model;
	   
	   Hyundai ( String c, String m, int p, int w)
	   {
		   super(p,w);
		   color = c;
		   model = m;
		   System.out.println("Class Hyundai extends Car");
		   System.out.println("Color of car = "+color);
		   System.out.println("Model of car =" +model);
		   
	   }
 }
 class Mercedes extends Car {
	   String color;
	   String model;
	   Mercedes (String c, String m, int p, int w ){
		   super(p,w);
		   color = c;
		   model = m;
		   System.out.println("Mercedes extends Car");
		   System.out.println("Color of car = " +color);
		   System.out.println("Model of car = " +model); 
	   }
 }
 class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle V =  new Car(10000000,4);
		V.start();
		V.stop();
		Car c = (Car)V;
		c.display();
		
		//Car C = new Car(100, 4);
	//	Truck T =new Truck(500,8);
	//	Bus B = new Bus(1000,10);
		Hyundai H =new Hyundai("RED", "LXI", 100000000,4);
		Mercedes M = new Mercedes("Green","VXI",500000000, 4);
		
	
		
		
		
		
		// TODO Auto-generated method stub

	}

}
