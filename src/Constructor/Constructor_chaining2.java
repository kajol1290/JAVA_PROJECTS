package Constructor;


class B {
	
	B(int x, int y)
	{
		this(5);
		System.out.println("Inside Paremeterised Constructor with 2 paremeters");
		System.out.println("x = " +x+ ", y = " +y +", x*y = " +x*y );
	}
	B(int x)
	{
		this();
		System.out.println("Inside parameterised constructor with 1 parameter");
	}
	B()
	{
		System.out.println("Inside DEFAULT Constructor......");
	}
}
public class Constructor_chaining2 {

	public static void main(String[] args) {
		B b = new B(2,4);
		
		// TODO Auto-generated method stub

	}

}
