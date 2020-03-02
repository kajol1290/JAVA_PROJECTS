package ExceptionHandling;

public class TryCatch4 {

	public static void main(String[] args) {
		  int a[]={2,4,5,5};
		  
		  System.out.println("Outside try and Catch");
		  
		  try {
			  System.out.println("Beginning of try Block");
			 System.out.println(a[10]);
			 System.out.println("End of try Block");
		  } 
		  
		 catch(ArrayIndexOutOfBoundsException e)
		  {
			 System.out.println("Beginning of Catch Block");
			 System.out.println(e);
			 System.out.println("End of Catch Block");
		  }
		  System.out.println("Out of try Catch Block!!");
		// TODO Auto-generated method stub

	}

}
