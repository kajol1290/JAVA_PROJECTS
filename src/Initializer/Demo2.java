package Initializer;


class B {
	   
	{
		System.out.println("Inside Instance Initialization Block -1");
	}
	
	{
		System.out.println("Inside Instance Initialization Block -2");
	}
	
	B()
	{
		System.out.println("Inside Constructor");
	}
	
	{
		System.out.println("Inside Instance Initialization Block -3");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		B b1 = new B();
		// TODO Auto-generated method stub

	}

}
