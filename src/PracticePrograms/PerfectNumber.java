package PracticePrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int sum=0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		n=sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
		System.out.println("Number is a perfect number");
		
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
		
	}
}

