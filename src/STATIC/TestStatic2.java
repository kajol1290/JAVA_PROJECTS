package STATIC;



class Static2 {
	   String name;
	   int age;
	   static String coName;
	   
	  static void display_static (Static2 s1)
	   {   
		 System.out.print(s1.name);   // static methods can access non static data members of a class by using object reference.
		   System.out.print(" "+ s1.age);  
		   System.out.println(" "+coName);// static methods can access the static data members of a class directly
	   }
	  
	void print_nonstatic()
	{
		
		System.out.print(name);
		System.out.print(" "+ age);
		System.out.println(" "+ coName);
	}
	
}

class TestStatic2 {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Static2 s1 = new Static2();
	Static2.coName = "TCS";
	s1.name = "Kajol";
	s1.age = 26;
	Static2.display_static(s1);  // static method of one class can be called inside static methods of another class only by using name of that class
	s1.print_nonstatic();
	

	}

}
