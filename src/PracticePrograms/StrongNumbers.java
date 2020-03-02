package PracticePrograms;

import java.util.Scanner;

// Strong numbers are the numbers in which sum of factorial of each digit of a number is number itself.
// e.g - 145=1!+4!+5!=1+24+120=145
public class StrongNumbers {
	
	  

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number: ");
	   int n=sc.nextInt();
	    
		
		int factorial;
		
		int temp=n;
		int rem=1;
		int sum=0;
		while(temp>0)
		{
			rem=temp%10;
			
			
			int i=1;
			factorial=1;
			while(i<=rem)
			{
				factorial=factorial*i;
				i++;
			}
			System.out.println("Factorial of "+rem+"is :"+factorial);
		
			
			sum= sum+factorial;
			temp=temp/10;

		}
		System.out.println("Sum of factorial of each digit f number is : "+sum);
		if(sum==n){
			System.out.println(" Number is Strong number");
		}
		else
		{
			System.out.println("Number is not a strong number");
		}
		
	}	

}
