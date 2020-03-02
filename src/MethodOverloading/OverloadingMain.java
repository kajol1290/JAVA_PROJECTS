package MethodOverloading;


public class OverloadingMain {

	public static void main(String[] args) {
		
		  System.out.println("Hello World");
		  main("America");
		  
	}
	public static void main(String arg1)
	{
		 System.out.println("Hello " +arg1);
		 main("Japan", "China");
		// TODO Auto-generated method stub

	}
	public static void main( String arg1, String arg2)
	{
		 System.out.println("Hello " +arg1 + " and " +arg2);
	}

}
