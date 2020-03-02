package Programming;

public class Armstrong {
	
	 static void calculate( int n)
	 {
		  int num =n;
		  int result=0;
		  int a;
		  int temp = n;
		  
		  while ( num != 0)
		  {
	         a=num%10;
			 num=num/10;
			 result = result + (a*a*a);
			 
		  }
		  if(result == temp)
		  { 
			  System.out.println("It is an Armstrong Number");
			  
		  }
		  else 
		  {
			  System.out.println("Not an Armstrong Number");
	 }
	 }

	public static void main(String[] args) {
		
		// Armstrong a = new Armstrong();
		calculate(152);
		// TODO Auto-generated method stub

	}

}
