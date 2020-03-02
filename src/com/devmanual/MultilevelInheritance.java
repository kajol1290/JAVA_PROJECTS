package com.devmanual;

 class A {
	  A()
	  {
		  System.out.println("A");
	  }
}

class B1 extends A {
	  B1()
	  {
		  System.out.println("B1");
	  }
}
class C1 extends B1
{
	
	C1 (String s)
	{
		super();
		System.out.println("C1");
		
	}
}

class D extends C1
{
	D ()
	{
		super("With Super");
	}
}
	   
class MultilevelInheritance{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();

	}

}
