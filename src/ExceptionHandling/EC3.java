package ExceptionHandling;
// Propagation of exceptions...
public class EC3 {
	void m()
	{
		int d = 50/0;
	}
	
	void n()
	{
		m();
	}

	void p()
	{
		System.out.println("~~~~~~~~Inside p()~~~~~~~~~~");
		try {
			System.out.println("Inside Try Block");
			 n();
		}
		catch(ArithmeticException e)
		{ 
			System.out.println("Handled");
			
		}
	
	finally
	{
		System.out.println("Outside try and catch block");
	}
		System.out.println("Outside p()");
	}
	public static void main(String[] args) {
		EC3 e1= new EC3();
		e1.p();
		
		// TODO Auto-generated method stub

	}

}
