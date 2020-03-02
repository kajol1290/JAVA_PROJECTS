package Array;

public class CopyingArray {
//when we copy one array into another directly , then change in the value of one array will be reflected in the other array 
	//also.This happens because both the array variables are pointing to the same object in memory
	// (array in java is basically an object). however, we don't want this.
	
	public static void main(String[] args) {
		
		int a[] = {2,4,6,9,55};
		
		for(int i =0; i<a.length; i++)
		{
		    System.out.println(a[i]);
		}
		
		int b [] = a;
		
		  b[3]=67;
         System.out.println();
		for(int i =0; i<b.length; i++)
		{
		    System.out.println(b[i]);
		}
		System.out.println();
		for(int i =0; i<a.length; i++)
		{
		    System.out.println(a[i]);
		}


	}

}
