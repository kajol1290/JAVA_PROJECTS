package Programming;
import java.util.Scanner;

 class StrongNumber {
 
	     static void calculate()
	     {
	        	   int r;
	        	   int s=0;;
	        	   //int b = 0;
	        	  System.out.println("Enter Strong Number");
	        	  Scanner sc = new Scanner(System.in);
	        	  int n = sc.nextInt();
	        	  while( n!=0)
	        	  {
	        		   r = n%10;
	        		   s = s + fact(r);
	        		   n = n/10;
	        	  }
	        	  if(s == n)
	        	  {
	        		  System.out.println("It is a Strong number!!!");
	        		  
	        	  }
	        	  else
	        	  {
	        		  System.out.println("Not an Armstrong Number");
	        	  }
	        	  
	     }
	    static  int fact(int i)
	    {
	    	   int f = 1;
	    	   for( int j = i; j>0 ; j--)
	    	   {
	    		   f = f*j;
	    	   }
	    	return f;
	    }
	         
	public static void main(String[] args) {
		calculate();
		// TODO Auto-generated method stub

	}

}
