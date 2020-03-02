
package com.devmanual;

class Dosa {
	  String name;
	  int price;
	  
	 
}
  class ShopKeeper {
	     int giveRateCard (String typedosa)
{
	 int price=80;
	  return price;
	
}
  
	     
  Dosa giveDosa(int n)
  {
	  //  Dosa D2 = new Dosa("Paneer dosa", 250);
	     Dosa d=new Dosa();
	       d.name="Paneer Dosa";
	       d.price=150;
	       return d; 
  }
  }
  
  class Customer {
	     Dosa askRate(String s)
	     {
	    	 System.out.println(s);
	    	 System.out.println("How much the DOSA Costs?");
	    	
	    	  System.out.println("Which one?");
	    	  String m="Paneer Dosa";
	    	  ShopKeeper S1=new ShopKeeper();
	    	  int price=S1.giveRateCard(m); 
	    	  Dosa rd=S1.giveDosa(price);
	    	  return rd;
	     }
	     void eatDosa(Dosa d)
	     {
	    	   System.out.println("Dosa Tastes Very Good!!!!");
	    	   System.out.println("AAAAhhhhhh!!!");
	     }
  }
	    	  
class TestDosa{
	public static void main(String [] args)
	{
		Dosa D1 =new Dosa();
		Customer C1=new Customer();
		String f="Feeling Hungry";
		Dosa rdd=C1.askRate(f);
		C1.eatDosa(rdd);
			   
		  }
	    	  
	     }
  