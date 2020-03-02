package MethodOverriding;


// RULE 1 : The Access specifier of overriding method allow for more or same but not less than the access specifier of 
 //          the overridden method.
class Parent {
	   private void show_1()
	   {
		   System.out.println("Inside Parent's Method  - show_1()");
	   }
	   
	   protected void show_2()
	   {
		    System.out.println("Inside Parent's Method -  show_2() ");
	   }
	   
}

class Child extends Parent {
	   private void show_1()
	    {
	    	System.out.println("Inside Child's Method  - show_1()");
	    	   
	    }
	    public void show_2()
	    {
	    	System.out.println("Inside Child's Method - show_2()");
	    }
}
public class Rule1_Overriding_AccessModifier {

	public static void main(String[] args) {
		Parent p2 = new Parent();
		p2.show_2();
	   //p2.show_1(); // Error - The method show_1() from the parent type is not visible because it is as private method.
		Parent p1 = new Child();
	//	p1.show_1(); // Error - The method show_1() from the parent type is not visible because it is as private method.
		p1.show_2();
	//	p1.show_1(); // Error - The method show_1() from the parent type is not visible because it is as private method.
			// TODO Auto-generated method stub

	}

}
