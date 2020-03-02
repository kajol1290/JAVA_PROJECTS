package ExceptionHandling;

public class TryCatch1 {

	public static void main(String[] args) {
		
		int i = 50;
		int j = 0;
		
		try {
			int c = i/j;
		}
		
		catch(ArithmeticException e) {
			
			System.out.println(e);
			
			
		}
		System.out.println("Out of try Catch block!");
		// TODO Auto-generated method stub

	}

}
