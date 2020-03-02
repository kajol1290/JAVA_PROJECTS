package PracticePrograms;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		
		   int n;
		   System.out.println("Enter number : ");
		   Scanner sc = new Scanner(System.in);
		   n=sc.nextInt();
		   int sum=0;
		   int temp=n;
		   while(n>0)
		   {
			   int a=n%10;
			   sum=sum+(a*a*a);
			   n=n/10;
		   }
		   
		   if(temp==sum)
		   {
		   System.out.println("Number is an armstrong number");
		   }
		   else
		   {
			   System.out.println("Number is not an armstrong number");
		   }
		   

	}

}
