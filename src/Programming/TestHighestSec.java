package Programming;

class TestHighestSec
{
	  
	  
	static  void display()
	
	{
	  int  [] arr = {2,68,4,21,5};
	  int sec = 0;
	  int max = arr[0] ;

      int  i=0;
	  while( i <5)
	  {
		  if(max<arr[i])
		  {
			  max = arr[i];
		  }
		  else
		  {
			  if(sec<arr[i] && max != arr[i])
			  {
				  sec = arr[i];
			  }
		  }
		  i++;
	  }
		  System.out.println("Highest element = : " +max);
		  System.out.println("Second Highest : " +sec);
	  }
		 
	  

	public static void main(String[] args) {
		display();
		// TODO Auto-generated method stub

	}

}
