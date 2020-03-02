package Abstract;

class Human {
	   String name;
	   
	private void eat ()  // private method will not be inherited and hence cannot be overridden.
	{
		System.out.println("Human Eats");
	}
	final void sleep()  // final class can be inherited but cannot be overridden
	                         // private final void sleep - error - final makes sure method is not overridden and private 
	                           // makes sure it is not inherited.
	{
		System.out.println("Human Sleeps");
	}
	
	void talk()
	{
		System.out.println("Human talks");
	}
}

class Man extends Human{
	
	
	 /* 
	    void sleep()
	  
	{
		System.out.println("Man Sleeps");  // sleep method in child class cannot be overridden because sleep is final 
		                                        // in parent class. the access specifier of child class overridden method 
		                     // should be same or more the the access specifier of parent class.
	}  
	*/ 
}


public class TestHuman {
  
	public static void main(String[] args) {
		Man m = new Man();
		
		m.name = "alice";
	//	m.eat(); // method eat() from Human type is not visible as it is private.
		m.sleep();
		m.talk();
		Human h = new Man();  // upcasted - it will access human methods.
		h.sleep();
		
		// TODO Auto-generated method stub

	}

}
