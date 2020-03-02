package ExceptionHandling;

public class EC1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		int c=0;
		try{
			c= a/b;
			System.out.println("End of try : c = " +c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide by 0");
			//e.printStackTrace(); // prints details of that exception.
			System.out.println("Exception details : "+e.getMessage()); // gives you the description of message
			System.out.println(e.toString()); // gives class name and description
			
			
			
		}
		
		//System.out.println("c = " +c);
		finally{
			//System.out.println();
			System.out.println("Outside try and catch block!!"); // final block will be executed whether an exception is 
			// handled or not.
		}
		// TODO Auto-generated method stub

	}

}
