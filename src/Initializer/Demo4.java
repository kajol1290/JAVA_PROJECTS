package Initializer;


class A1 {
	
	   A1()
	   {
		   System.out.println("Inside A1 Class Default Constructor");
	   }
	   A1(int a) 
	   {
		   System.out.println("Inside A1 Class Parameterised Constructor");
	   }
	   
	   static 
	   {
		   System.out.println("Inside 1st Static Block");
	   }
	   
	   {
		   System.out.println("Inside 1st Intance Initialization Block");
	   }
	   
	   {
		   System.out.println("Inside 2nd Intance Initialization Block");
	   }
	   
	   static 
	   {
		   System.out.println("Inside 2nd Static Block");
	   }
	   
	   {
		   System.out.println("Inside 3rd Intance Initialization Block");
	   }
}
  
public class Demo4 {

	public static void main(String[] args) {
		A1 a = new A1();
		A1 a2 = new A1(10);
		
		// TODO Auto-generated method stub

	}

}
