package INTERFACE;


interface Int {
	
	void p();  // public and abstract method by default
}
abstract class Abs implements Int {
	public void p()  // non- abstract method
	{
		System.out.println("Inside ABSTRACT CLASS - Abs!!");
		System.out.println("Abstract Providing implementation to Method a() of Interface - Int");
	}
    abstract void q();
	abstract void r();
	abstract void s();
	
}

class Cls extends Abs {
	void q()
	{
		System.out.println("Inside Java Class - Cls");
		System.out.println("q() ");
	}
	
	void r()
	{
		System.out.println("r()");
	}
	void s()
	{
		System.out.println("s()");
	}
}
public class AbsAndInt {

	public static void main(String[] args) {
		Cls c = new Cls();
		c.p();
		c.q();
		c.r();
		c.s();
		
		
		// TODO Auto-generated method stub

	}

}
