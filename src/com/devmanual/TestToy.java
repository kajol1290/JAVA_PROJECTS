package com.devmanual;

class Toy
{
	String name;
	double price;
}

class Kid{
	  Toy cry()
	  {    
		   
		   Mom m = new Mom();
		   String s = "Bhainnnnn";
		   Toy t = m.wakesAndPurchase(s);
		   m.givesToy(t);
		   return t;
	  }
		  void receiveToy ( Toy t)
		   {
			    System.out.println("Yeahh");
		   }
	  }


class Mom{
	  Toy wakesAndPurchase( String awaaz)
	  {
		   System.out.println("Alee le , wait!!");
		   Shopkeeper_5 s = new Shopkeeper_5();
		   Toy t = s.sellToy(135.50);
		   return t;
		   
	  }
 void givesToy( Toy t)
 {
	   System.out.println("Bache take the toy");
 }
}

class Shopkeeper_5{
	  String name;
	 Toy sellToy(double toy)
	 {
		 Toy t = new Toy();
		 t.name="spiderman";
		 t.price=135.50;
		 return t;
		 
	 }
}
class TestToy {
	 public static void main ()
	 {
		   Kid k = new Kid();
		   Toy t = k.cry();
		   k.receiveToy(t);
	 }
}


