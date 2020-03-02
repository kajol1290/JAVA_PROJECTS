package ExceptionHandling;

public class EC2 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to this method!!");
		
		try
		{
			System.out.println("Inside try");
			Class.forName("EC1");
			System.out.println("End of try");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Handled");
			
		}
		System.out.println("Outside try and catch block!");
		
		// TODO Auto-generated method stub

	}

}
