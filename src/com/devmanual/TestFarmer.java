package com.devmanual;

class Farmer {
	          String name;
	//  boolean is_water=true;
	        Message  goestocow(){
		    Cow c1=new Cow();
		    c1.cowWantsWater();
		    System.out.println("Farmer Goes to Cow");
		    c1.cow_color="White";
		    System.out.println("Cow color is = " +c1.cow_color);
		    Message r=c1.cowDrinksWater();
		    System.out.println("Farmer got a message from cow = " +r.words);
		    return r;
		     
	  }
}
class Message{
	          String words;
}

class Cow{
	String returnwords;
	String cow_color;
//	boolean is_water=true;
	void cowWantsWater()
	{
		 
		 System.out.println("Cow is thirsty");
	
	}
	Message cowDrinksWater(){
		  
		  System.out.println("Cow drinks water");
		  System.out.println("Mowwwwww");
		  Message m2=new Message();
		  m2.words="SHUKRIYA";
		  return m2;	  
	}
	  
}
  
class TestFarmer {

	    public static void main(String[] args) {
		Farmer f1=new Farmer();
		f1.name="Ramesh";
		System.out.println("Farmer name is = " +f1.name);
		Message m=f1.goestocow();
		System.out.println("Message is " +m.words);
		
	}

}
