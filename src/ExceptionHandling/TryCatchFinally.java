package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {

		String[] s = {"123", "sdfgh", "4568"};
		
		
		try
		{
			System.out.println("Inside try Block!!");
			for (int i = 0; i < s.length; i++) 
			{
				int val = Integer.parseInt(s[i]);// this may throw number format exception
			}
		} 
		catch (Exception e)
		{
			System.out.println("Exception Caught - inside Catch block!!!!!");
		}
		finally
		{
			System.out.println("Final block will always be executed");
		}
		
	}

}
