package Initializer;


class Parent {
	   
	{
		 System.out.println("Inside Parent Class Instance Initializer Block");
	}
	 Parent()
	 {
		 System.out.println("Inside Parent class Constructor");
	 }
}

class Child extends Parent {
	
	Child()
	{
		super();
		System.out.println("Inside Child class Constructor");
	}
	{
		System.out.println("Inside Child Class Instance Intialization Block");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Child c1 = new Child();
		// TODO Auto-generated method stub

	}

}
