package Initializer;


class A {
	   // int x;
	{
		System.out.println("Inside INITIALIZER BLOCK......");
	}
	A()
	{
		  System.out.println("Inside CONSTRUCTOR BLOCK!!!!!!");
	}
	A( int a)
	{ 
		 System.out.println("INSIDE PARAMETERIZED CONSTRUCTOR!!!!!!! Value of parameter passed is " +a);
	}
}
 
public class Demo1 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(5);
	

	}

}
