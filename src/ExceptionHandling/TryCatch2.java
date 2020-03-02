package ExceptionHandling;
// to print custom message on exception.
public class TryCatch2 {

	public static void main(String[] args) {
		
		int  i = 50;
		int j = 0;
		
		try {
			int c = i/j;
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cant divide by zero!!");
		}
	}

}
