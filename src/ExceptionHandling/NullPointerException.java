package ExceptionHandling;

public class NullPointerException {

	public static void main(String[] args) {
		
		try
		{
			 String s = null;
			 System.out.println("Inside try Block!!");
			  System.out.println("String lenghth is :" +s.length()); // this throw null pointer exception
			
		}
		catch (Exception e)
		{
			System.out.println("Exception Catched!! - Inside catch block");
		}
	 
	  System.out.println("Outside try catch block");
	  

	}

}
