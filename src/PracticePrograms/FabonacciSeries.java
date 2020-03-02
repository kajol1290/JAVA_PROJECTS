package PracticePrograms;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		int count;
		int n1=0,n2=1,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Upto What count you want to print fabonacci series??");
		count = sc.nextInt();
		System.out.println(n1 +" "+ n2);
		
		for (int i = 2; i < count; i++) 
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		  System.out.println(n3);
		}
		

	}

}
