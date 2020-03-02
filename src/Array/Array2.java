package Array;
import java.util.Scanner;

public class Array2 {
	
	static void display()
	{ 
	 int n;
	 
	 System.out.println("Enter  length of Array : ");
	 Scanner sc = new Scanner(System.in);
	 n = sc.nextInt();
	 int [] arr = new int[n];
	 System.out.println("Enter array elements : ");
	 for(int i = 0; i<n; i++)
	 {
		 arr[i] = sc.nextInt();
	 }
	 System.out.println("Array elements are : ");
	 for(int i = 0; i<n; i++)
	 {
		System.out.println(arr[i]);
	 }
	
	 
	 int j = 0;
	 int max = arr[0];
	 while(j < n)
	 {
		if(arr[j] > max)
		{
			max = arr[j];
           
		}
		j++;
	 }
	 System.out.println("Highest element of an array is : " +max);
}

public static void main(String [] args) 
{
	display();
	 
}
}
