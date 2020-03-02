package Pattern;

public class Pattern2 {
	
	  static void display(int n)
	  {
		   for(int i = n; i>=1; i--)
		   {
			    for (int j=1; j<i;j++)
			    {
			    	System.out.println(" ");
			    }
			    for ( int k = n; k>=i; k--)
			    {
			     System.out.println("*");
			    }
			    System.out.println();
		   }
		  
	  }

	public static void main(String[] args) {
		
		display(5);
		// TODO Auto-generated method stub

	}

}
