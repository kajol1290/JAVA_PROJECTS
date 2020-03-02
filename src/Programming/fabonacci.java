package Programming;

public class fabonacci {
	
	static void display(int n)
	{
		 int t1 = 0, t2 =1, sum=0;
		 int i =0;
		 System.out.println("Upto " + n+ " numbers: ");
		 System.out.print(t1 +" " + t2);
		 while(i<=n)
		 {
			// System.out.println(t1 + " " +t2);
			 sum = t1+t2; 
			 
			 
			 
			 t1=t2;
			 t2 = sum;
			 System.out.print(" " + sum);
			 
			i++;
		 }
	}

	public static void main(String[] args) {
		display(20);
		// TODO Auto-generated method stub

	}

}
