package com.devmanual;


class Farmer2 {
	
	  String cow_color = "White";
	
	  void cowWantsWater()
	  { 
		   String water="100L";
		   System.out.println("Cow is thirsty");
		   farmerGoesToCow(water);
	  }
	   void  farmerGoesToCow(String water)
	   
	   { 
		  
		   System.out.println("Farmer goes to cow");
		   System.out.println("Cow color is = " +cow_color);
		   System.out.println("Farmer brings water = " +water);
		   System.out.println("Cow drinks water");
		   String message = "SHUKRIYA";
		   messageFromCow(message);
		  
	   }
	 
	   void messageFromCow(String m)
	   {
		   
	   System.out.println("Farmer gets the Message from Cow= " +m);
}
	   
}
public class TestFarmer2 {

	public static void main(String[] args) {
		Farmer2 F1 = new Farmer2();
		F1.cowWantsWater();
		
	}

}
