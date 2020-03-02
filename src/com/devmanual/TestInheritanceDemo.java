package com.devmanual;
class InheritanceDemo {
	
	String name  = "Qspiders";
	InheritanceDemo()
	{
		System.out.println("Inside constructor of super class");
	}
	}

class B extends InheritanceDemo {
	
}
class TestInheritanceDemo {

	public static void main(String[] args) {
		
		B b = new B();
			System.out.println(b.name);
		    b.name = "Jspiders";
		    System.out.println(b.name);
		// TODO Auto-generated method stub

	}

}
