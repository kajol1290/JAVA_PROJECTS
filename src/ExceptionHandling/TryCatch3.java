package ExceptionHandling;

public class TryCatch3 {

	public static void main(String[] args) {
          int a[] = {1,2,3,4};
          
         try {
        	 
        	 System.out.println(a[10]);
         }
         
         catch(ArrayIndexOutOfBoundsException e)
         {
        	 
        	 System.out.println(e);
         }
         System.out.println("Out of try and Catch");
	}

}
