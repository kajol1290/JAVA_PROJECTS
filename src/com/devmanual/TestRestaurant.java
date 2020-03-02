package com.devmanual;


 class Restaurant{
	 String name;
	 String addr;
	void display()
	 {
		    System.out.println("I am in display method");
		    System.out.println("Welcome guest");
			System.out.println("Welcome to hotel Radisson");
			System.out.println("Todays Menu is Shahi Paneer");
			System.out.println("Hope you had a good time");
			System.out.println("Thankyou!! Hope to see you again");
			System.out.println("\n");
			return;     // optional
	 }
 }
 
	 class Guest {
         String name;
 }
  
 
 class  TestRestaurant{
	 
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		Restaurant R1=new Restaurant();
		R1.name="RADISSON";
		R1.addr="noida";
		
		Guest g1=new Guest();
		g1.name="KAJOL";
		System.out.println(g1.name);
		R1.display();  // METHOD CALLING LINE
		System.out.println("I am back in main method");
		
		Guest g2=new Guest();
		g2.name="Chetna";
		System.out.println(g2.name);
		R1.display();
		
	}

}
