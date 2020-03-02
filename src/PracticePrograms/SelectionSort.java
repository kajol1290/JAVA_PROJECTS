package PracticePrograms;

public class SelectionSort {

	
	 public static void selSort(int [] arr)
	 {
		 int pos;
		 int temp;
		 for (int i = 0; i < arr.length-1; i++) 
		 {
			pos=i;
		  for (int j=i+1; j < arr.length; j++)
		 {
			if(arr[pos]>arr[j])
			{
				pos=j;
			}
		}
		  temp=arr[pos];
		  arr[pos]=arr[i];
		  arr[i]=temp;
		  
	 }
	 } 	
	public static void main(String[] args) {
		
		
		int a[]={4,8,0,6,2,1,77};
		System.out.println("Array before sorting: ");
		for(int i:a)
		{
			System.out.println(i);
		}
		selSort(a);
		
		System.out.println("After sorting");
		for(int i:a)

		{
			System.out.println(i);
		}
		
		
		

	}

}
