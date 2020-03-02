package Sorting;

public class BubbleSort {
	
	static void display()
	{
	   int arr [] = {1,4,7,3,5};
	   int temp = 0;
	   for(int i = 0; i<arr.length;i++)
	   {
		   for(int j=0; j<i;j++)
		   {
	   
		   
			   if(arr[j]>arr[j+1])
		   {
			   temp=arr[j];
			   arr[j]=arr[j+1];
		   }
		    
		   System.out.print(arr[j] + " ");
		   }
	   }
}

	public static void main(String[] args) {
		display();
		// TODO Auto-generated method stub

	}

}
