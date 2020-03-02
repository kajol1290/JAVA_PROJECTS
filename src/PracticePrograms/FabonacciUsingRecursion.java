package PracticePrograms;

public class FabonacciUsingRecursion {
	
	static int n1=0,n2=1,n3;
	
  public static void printFabonacci(int count)
   {
	   
	  if(count>0)
	  {
		  n3=n2+n1;
		  n2=n3;
		  n1=n2;
		  System.out.println(" "+n3);
		 printFabonacci(count-1); 
	  }
   }
	

	public static void main(String[] args) {
	int count=5;
     System.out.println(n1 +" "+ n2);// to print first 2 numbers.
     printFabonacci(count-2);// as 2 numbers have already printed.
      

	}

}
