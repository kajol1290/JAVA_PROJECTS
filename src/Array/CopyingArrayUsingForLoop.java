package Array;
// using for loop changes in one array will not be reflected in the original array.
public class CopyingArrayUsingForLoop {

	public static void main(String[] args) {
		
		int a[] = {3,6,9,4,67};
		
		int b[] = new int[a.length];
		
		for(int i = 0; i<a.length; i++)
		{
			  b[i]=a[i];
			  System.out.println(b[i]);
		}
		
		b[2]=100;
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]); // array a will remain unchanged.
		}
		
	

		  

	}

}
