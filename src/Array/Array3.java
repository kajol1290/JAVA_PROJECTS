package Array;

public class Array3 {

	public static void main(String[] args) {
		// int b[]; // declaration of an array
		// b = new int[5]; // instantiation of array;
		// b[0]=0;  // initialization
		int b[]={1,2,3,4,5};// Declaration, instantiation and initialization all in same line.
		int a[] = new int[5];  // declaration and instantiation of array.
		a[0]=3;// initialization of array
		a[1]=4;
		a[2]=10;
		a[3]=55;
		a[4]=23;
		
		/*
		// accessing array elements using for loop
		for(int i =0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
		// accessing arr elements using for each loop.
		
		for(int arr : a)
		{
			System.out.println(arr);
		}
	}

}
