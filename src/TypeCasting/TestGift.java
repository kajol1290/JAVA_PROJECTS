package TypeCasting;

 class Gift {
	   String category;
	   String wrapcolor;
	   
	   void give()
	   {
		   System.out.println("Give");
	   }
}

class Chocolate extends Gift {
	  
	   int price;
	  void eat ()
	  {
		  System.out.println("Eat");
	  }
}

class Flowers extends Gift
{
	 int price;
	 
	 void see()
	 {
		  System.out.println("smell");   
	 }
}
 class TestGift {

	public static void main(String[] args) {
		
		Gift g =new Chocolate();  // upcasting  - allows to work only on superclass members and not on subclass members
		g.wrapcolor="RED";     // works wrapcolor is superclass Gift Member. g.price - will not works as price is sublass 
		                       // Chocolate member.
		g.category="CHOCOLATE";
		// g.price=50;   // Error
		g.give();	
		System.out.println(g.wrapcolor);
		System.out.println(g.category);
		//Flower f = new Chocolate(); // upcasting doesnot work for siblings 
		Chocolate c =(Chocolate)g;     // DownCasting - We can downcast only that class which we have upcasted.
		c.price=100;
		System.out.println(c.price);
		Flowers f = (Flowers)g;        // Downcasting - syntatically correct , but here it exception at run time. ClassCast Exception. -
		                                 //"Chocolate cannot be cast to TypeCasting "Flowers". 
		f.price=120;
		System.out.println(f.price);
		int i =5;
		int j = 10;
		int sum = i+j;
		byte k=5;
		byte l=20;
		
		//byte value = k+l+sum; //ERROR  - cannot convert from int to byte.(Storing int to byte)
		int valuek = (int)k;
		long valuel = (int)k;
	    int valuem  = k+l+sum; //Conversion Possible , int is bigger than byte.
	 //   byte c = (byte)i;
		// TODO Auto-generated method stub

	}

}
