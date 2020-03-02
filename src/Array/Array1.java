package Array;

import java.util.Scanner;
public class Array1 {
	 static void display()
	 {
		 int len;
		 
		 System.out.println("Enter the length of array : ");
		 Scanner sc = new Scanner(System.in);
		// sc.nextLine();
		 len = sc.nextInt();
		 int arr[]  = new int[len];
		 System.out.println("Enter " + len + "elements : ");
		// sc.nextLine();
		 for ( int i = 0; i<len; i++)
		 {
			 
			 arr[i] = sc.nextInt();
			// System.out.println(arr[i]);
		 }
		 System.out.println("Array elements are :");
		 for ( int i = 0; i<len; i++)
		 {
			 
			 System.out.println(arr[i]);
		 }
		 System.out.println("Printing array elements Using for each loop");
		 for (int  i : arr)
		 {
			 System.out.println(i);
		 } 
	 }
	public static void main(String[] args) {
		 display();
		// TODO Auto-generated method stub

	}

}
