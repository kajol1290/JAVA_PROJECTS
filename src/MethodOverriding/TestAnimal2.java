package MethodOverriding;

// STATIC Methods cannot be Inherited. hence, they cannot be overridden.
  // If we try to override them, they will be hidden in the sub-class.
class Animal2 {
	
	  static void m1()
	  {
		    System.out.println("***************************************************************");
		    System.out.println("Inside Animal(Parent Class) static method - m1()");
	  }
	  void m2()
	  {
		    System.out.println("Inside Animal(Parent Class) non-static method - m2()");
	  }
}			  
class Dog2 extends Animal2 {
	   
	  static void m1()
	  {
		   System.out.println("****************************************************************");
		   System.out.println("Inside Dog2(Child Class) static method - m1()");
	  }
	  void m2()
	  {
		   System.out.println("Inside Dog2(Child class) non-static method - m2()");
}
	   
}
public class TestAnimal2 {

	public static void main(String[] args) {
		Animal2 p1  = new Animal2();
		 p1.m1();
		 p1.m2();
		 
		 Animal2 p2 = new Dog2();
		 p2.m1();
		 p2.m2();
		 
		 Dog2 d1 = (Dog2) p2;
		 d1.m1();
		 d1.m2();
		// TODO Auto-generated method stub

	}

}
