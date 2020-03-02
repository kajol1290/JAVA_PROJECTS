package Packages;
import Demo.*;
public class Dummy3 extends Dummy1{

	public static void main(String[] args) {
		Dummy3 d3 = new Dummy3();
		Dummy1 d1 =  new Dummy1();
		d3.a= 10;// a is protected member, so in order to access it, class dummy1 needs to inherit the dummy3 class.
		d3.b=20; // b is public member, so accessible without the need of inheriting the class dummy1.
		System.out.println("Inside Dummy1 class of package -  Packages");
		System.out.println(d3.a);
	//	System.out.println(d3.a);  // if a is a public member of class, we can assign value to a data member of class by
		   // dummy3 reference variable.
		d3.print();
		
		System.out.println(d3.b);
		// TODO Auto-generated method stub

	}

}
