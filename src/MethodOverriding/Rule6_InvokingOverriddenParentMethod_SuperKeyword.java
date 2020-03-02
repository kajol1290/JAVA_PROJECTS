package MethodOverriding;

// Subclass can invoke Parent's class Overridden method by using "super"keyword.
class Animal3 {

	
	void m1()
	{
		System.out.println("Inside Animal(Parent Class) method - m1()");
	}
}
 class Dog3 extends Animal3 {
	    void m1()
	    {
	    	//super.m1();
	    	System.out.println("Inside Dog(Child Class) method - m1()");
	    }
	    void print(){
	    	
	       // super.m1();
	    	System.out.println("Inside Dog(Child Class) print() ");
	    	super.m1();       // calls overridden parent class method m1()
	    	
	    	
	    }
 }
 public class Rule6_InvokingOverriddenParentMethod_SuperKeyword {
	public static void main(String[] args) {
		
		Animal3 p1 = new Dog3();  // UPCASTING 
		p1.m1();                  // calls Parent class method m1()
		
		Dog3 d1 = (Dog3) p1;   //DOWNCASTING
		d1.m1();                
		d1.print();
		
		
		
		// TODO Auto-generated method stub

	}

}
