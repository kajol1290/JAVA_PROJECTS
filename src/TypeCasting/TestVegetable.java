package TypeCasting;
class Vegetable {
	    String color;
	    String category;
	    
	    void buy_veg()
	    {
	    	System.out.println("Buy Vegetable");
	    	
	    }
	    
}

class Potato extends Vegetable {
	    int price;
	    
	    void buy_Potato ()
	    {
	    	 System.out.println("Buy Potato");
	    }
}
class Spinach extends Vegetable {
	
	   int price;
	   
	    void Buy_Spinach ()
	    {
	    	 System.out.println("Buy Spinach");
	    	 
	    }
}
class TestVegetable	 {   
	public static void main(String [] args) {
	  Vegetable V = new Potato();   // Upcasting
	   V.category="ROOT";
	   V.color = "Brown";
	  // V.price=100;
	   System.out.println(V.category);
	   System.out.println(V.color);
	   Potato P = (Potato) V;     // Downcasting
//	   Flowers F (Flowers) V;
	   P.price=100;
	   System.out.println("Potato Price = " +P.price);
	   
	   
	   
	   
		// TODO Auto-generated method stub

	}

}

