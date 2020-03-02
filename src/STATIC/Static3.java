package STATIC;


class Static3 {
	   String name;
	   int age;
	   static String coName;
	   
	  static void display_static (Static3 s3)
	   {   
		 System.out.print(s3.name);   // static methods can access non static data members of a class by using object reference.
		   System.out.print(" "+ s3.age);  
		   System.out.println(" "+coName);// static methods can access the static data members of a class directly
	   }
	  
	void print_nonstatic()
	
	{
		
		System.out.print(name);
		System.out.print(" "+ age);
		System.out.println(" "+ coName);
	}
	public static void main( String [] args)
	{
		Static3 s3 = new Static3();
		Static3.coName = "INFOSYS";
		s3.name = "Chetna";
		s3.age = 25;
		display_static(s3);   // static method inside of a class can be called directly inside static method of the same class
		s3.print_nonstatic(); // non - static method can be called inside static methods of same class only by object creation
	}
}