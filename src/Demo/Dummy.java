package Demo;

import Qspiders.AML;  // importing class AML of package Qspiders.


public class Dummy extends AML {
	    
 // public class Dummy {
	public static void main(String[] args) {
		 AML a = new AML();
		Dummy d = new Dummy();  // we need to use the object of child class to access the members of parent class AML.
	    System.out.println(d.name);  // Protected members of a class A of a package P1 is accessible inside 
	                                   //different class B of another package P2 only if that class B has IS-A(inheritance) 
	                                  //relationship with the first class A of package P1.
	    System.out.println(d.age); // 
	    System.out.println(d.is_clear);
	 //   System.out.println(a.age); // members declared as public in class AML (parent class) of package Qspiders
	                                  // can be accessed inside inherited class Dummy
	                               // of different package Demo either by using object reference of dummy class or AML class.
	    System.out.println(d.gender);
	    d.name="KAJOL"; // we can assign values to members of a class A of  package P1 inside a different class B under a 
	               //package P2 which has imported package P1 only if the members of class A has access specifier public
	             // and this is not applicable wit members having access specifier protected or package or private.
	    d.age=10;  // We can use object reference of extended class "Dummy" only to access the values of class "AML"
	                 //of package Qspiders.
	    d.is_clear=false;
	    d.gender='F';
	    
	    d.display();
		
		
		
		// TODO Auto-generated method stub

	}

}
