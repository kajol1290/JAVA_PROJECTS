
import java.util.Scanner;
public class Array1 {
	 static void display()
	 {
		 int len;
		 
		 System.out.println("Enter the length of array");
		 Scanner sc = new Scanner(System.in);
		 len = sc.nextInt();
		 int arr[]  = new int[len];
		 System.out.println("Enter " + len + "elements");
		 for ( int i = 0; i<len-1; i++)
		 {
			 
			 arr[i] = sc.nextInt();
			 System.out.println(arr[i]);
		 }
		 System.out.println("Array elements are :");
		 for ( int i = 0; i<len; i++)
		 {
			 
			 System.out.println(arr[i]);
		 }
	 }
	public static void main(String[] args) {
		 display();
		// TODO Auto-generated method stub

	}

}
