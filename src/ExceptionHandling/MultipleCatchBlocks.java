package ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		
		try {
			
		 int a[] = new int[5];
		 a[5] = 50/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Out of Bounds Exception");
		}
		 catch (Exception e)
		{
			 System.out.println("General Exception");
			 
			 
		}
				 
		System.out.println("Outside try Catch Block");
		// TODO Auto-generated method stub

	}

}
