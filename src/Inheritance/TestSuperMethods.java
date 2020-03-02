package Inheritance;



class SuperMethods {
	    void message()
	    {
	    System.out.println("I am inside Parent class");
}
}
class Base extends SuperMethods {
	   void message ()
	   {
		   System.out.println("I am inside Sub Class");
	   }
	   
	   void display()
	   {
		   System.out.println("I am inside display() function of base class");
		   message();        // it will invoke base class method "message()"
		   super.message();   // it will invoke parent class method "message()"
	   }
}
 class TestSuperMethods {

	public static void main(String[] args) {
		Base b1 = new Base();
		b1.display();
	}
		// TODO Auto-generated method stub

	}


