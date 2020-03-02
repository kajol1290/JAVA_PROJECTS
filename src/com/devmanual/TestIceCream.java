package com.devmanual;
class IceCream
{
	    String type;
	   int scoops;
	   int price;
	   boolean is_good; 
	   
	   IceCream (String t, int s, int p, boolean ig)
	   {
		  /* System.out.println("IceCream type is = " +type + ", Scoops = " +scoops+ ", Price = " +price + ","
		   		+ " Is it Good = " +is_good); */
		   type = t;
		   scoops = s;
		   price = p;
		   is_good = ig;
		   System.out.println("IceCream type is = " +type + ", Scoops = " +scoops+ ", Price = " +price + ","
			   		+ " Is it Good = " +is_good);
		  
		   
	   }
	   IceCream (String t, int m)                      // Constructor Overloading
	   {
		   type=t;
		   scoops=m;
		   System.out.println("~~~~~~~~~~~~~~~~~~This is CONSTRUCTOR OVERLOADING~~~~~~~~~~~~~~~~~~~~~~~~");
		   System.out.println("Icream type is = " +type + ", No of scoops = " +scoops);
	   }
	 /*  void fun(String t , int s, int p, boolean ig)
	   {
		   System.out.println("Ice type is = " +type + ", Scoops = " +scoops+ ", Price = " +price + ", Is it Good = " +is_good);
	   }
}*/
}
public class TestIceCream {
	       
	public static void main(String[] args) {
		IceCream IC1 = new IceCream("Vanilla", 2,100,true);
	//	System.out.println(IC.type);														
	    System.out.println("IC1.type = " +IC1.type);
		IceCream IC2 = new IceCream("Chocolate", 2, 100, false);
		IceCream IC3 = new IceCream("Blueberry", 4 ,200, true); 
		IceCream IC4 = new IceCream("Vanilla" , 9);
		
	

	}

}
