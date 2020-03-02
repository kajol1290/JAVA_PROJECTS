package PracticePrograms;

import java.util.Scanner;

public class Palingdrome {
	
	public static void paling(int n)
	{
		int temp=n;
		int r;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Number is palingdrome...");
		}
		else
		{
			System.out.println("Number is not a palingdrome");
		}
	}

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter number..............");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		paling(n);


	}

}
