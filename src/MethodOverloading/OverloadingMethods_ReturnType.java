package MethodOverloading;


class A1 {
	   char foo (int x)
	   {
		     return 'a';
	   }
	   
	   int foo (int y, int z)
	   {
		    return 10;
	   }
}
public class OverloadingMethods_ReturnType {

	public static void main(String[] args) {
		
		   A1 a = new A1();
		  System.out.println(a.foo(3,5));
		  System.out.println(a.foo('z'));
		// TODO Auto-generated method stub

	}

}
