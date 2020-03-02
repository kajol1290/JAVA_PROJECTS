package MethodOverloading;


class A {
	   char show(char x) {
		       return 'a';
	   }
	   
	  /* int show( int y )
	   {
		    return 10;
	   }
	   */
	  String show(String z)
	  {
		   return "Hello World";
	  }
	  double show( double d)
	  {
		  return 10.234567;
	  }
	  float show( float f)
	  {
		  return 25.05f;
	  }
}
public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println("char show() - " +a.show('b'));
		System.out.println("int show() - " +a.show(100));  //next higher family i.e float
		System.out.println("int show() - " +a.show(100.012d)); // double
		System.out.println("String show() - " +a.show("A"));  // String show()
		System.out.println("double show() - "+a.show(15.32));  // invokes double show() because by default floating point
		                                                       //numbers are double precision quantities.
		System.out.println("double show() - "+a.show(15.32d)); // double show()
		System.out.println("float show() - "+a.show(15.32f));   // float show()
		
		// TODO Auto-generated method stub

	}

}
