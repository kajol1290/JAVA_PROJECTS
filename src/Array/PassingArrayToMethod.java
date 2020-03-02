package Array;

public class PassingArrayToMethod {
	
	static void arrM(int arr[])
	  {
	     int min=arr[0];
	     for(int i =0; i<arr.length;i++)
	     {
	    	 if(min>arr[i])
	    	 {
	    		 min=arr[i];
	    	 }
	     }
	     System.out.println("Min Value of an array is :"+min);
	  }

	public static void main(String[] args) {
		//PassingArrayToMethod p = new PassingArrayToMethod();
		int a[]={2,6,4,8,3};
		//p.arrM(a);
		arrM(a);
		
	}

}
