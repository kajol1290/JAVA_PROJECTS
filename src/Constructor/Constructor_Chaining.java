package Constructor;


class A 
{
	   A()
	   {
		    this(5);
		    System.out.println("Inside DEFAULT Constructor......");
	   }
	   
	   A(int y)
	   {
		   this(5,10);
		   System.out.println("Inside parameterised constructor with 1 parameter");
		   
	   }
	   A(int x, int y)
	   {
		   System.out.println("Inside Paremeterised Constructor with 2 paremeters");
		   System.out.println("x  = "+x + ", y = " +y+ ", x * y =  "+x*y);
	   }
}
public class Constructor_Chaining {

	public static void main(String[] args) {
		A a = new A();
		// TODO Auto-generated method stub

	}

}
