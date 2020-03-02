package PracticePrograms;
// 

public class BubbleSort {
	
	public static void bubbleS(int [] arr)
	{
		int temp;
		int pos;
		for (int i = 0; i < arr.length; i++)
		{
			for(int j=1;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					//swap
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int a[]={2,5,7,5,8};
		System.out.println("Array before bubble sort: ");
		for(int i:a)
		{
			System.out.println(i);
		}
		
		bubbleS(a);
		System.out.println("Array after bubble sort : ");
		for(int i:a)
		{
			System.out.println(i);
		}
		
		
	    
		
		
		
		
	}

}
