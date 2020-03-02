package MethodOverriding;

// Static methods cannot be Inherited. Hence, they cannot be overridden.
class Parent1 {
	
	    static void m1()
	    {
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    	System.out.println("From Parent's static method - m1()");
	    }
	    
	    void m2() {
	    	 System.out.println("From Parent's non-static(instance) method method - m2()");
	    }
	    
}

class Child1 extends Parent1 {
	    static void m1()
	    {
	    	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    	  System.out.println("From Child's static method m1() ");
	    } 
	    void m2(){
	    	System.out.println("From Child's non-static(instance) method - m2()");
	   
	    }
}


public class Rule3_StaticMethods_Overriding {

	public static void main(String[] args) {
		
		Parent1 p2 = new Parent1();
		p2.m1();  // Parent's m1()
		p2.m2();  // Parent's m2()
		Parent1 p1 = new Child1();
		p1.m1();  // This will Access the Parent's class static method. Because, Static methods cannot be overridden
		           // if we try to override them, they will be hidden in the sub-class.
		          // This is called, METHOD HIDING.
		p1.m2();// Child's m2() - Because here the superclass reference p1 will access the superclass method but however,
		         // the implementation will come from  subclass method.
		
		Child1 c1 = (Child1) p1;
		c1.m1();
		c1.m2();
		// TODO Auto-generated method stub

	}

}
