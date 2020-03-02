package Array;

import java.util.Arrays;

public class CopyingArrayUsingcopyOfMethod {

	public static void main(String[] args) {
            
		
		int a[] = {2,4,6,8,10};
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		/*
		// using copyOf() method
		int b[]=Arrays.copyOf(a, a.length);
		*/
		
		//using clone() method
		
		//int b[]= a.clone();
		
		//Using arraycopy() method.
		int b[]=new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println();
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		  b[2]=100;
		  
		  System.out.println();
		  for(int i=0; i<b.length;i++)
			{
				System.out.println(b[i]);
			}
		  
		  // original array remain intact, same.
		  System.out.println();
		  for(int i=0; i<a.length;i++)
			{
				System.out.println(a[i]);
			}
	}

}
