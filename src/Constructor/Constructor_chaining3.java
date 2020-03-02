package Constructor;


class C {
	   C()
	   {
		   System.out.println("Inside Parent +- Constructor");
	   }
	   C(int z)
	   {
		   System.out.println("z = " +z);
	   }
}

class D extends C {
	   D()
	   {
		   super();
		   System.out.println("Inside Child class's Constructor");
	   }
	   D(int x, int y ,int z)
	   {
		  super(z);
		  System.out.println("x = " +x+ ", y = " +y +", z = " +z);
	   }
}
public class Constructor_chaining3 {

	public static void main(String[] args) {
		D d  = new D();
		D d2 = new D(1,2,3);
		// TODO Auto-generated method stub

	}

}
