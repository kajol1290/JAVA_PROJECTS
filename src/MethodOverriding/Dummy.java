package MethodOverriding;


class D {
	private void m1()
	 {
		 System.out.println("Hello");
	 }
}

class E extends D {
	 void m1() {
		  System.out.println("World");
	  }
}
public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E d = new E();
		d.m1();
	
		

	}

}
