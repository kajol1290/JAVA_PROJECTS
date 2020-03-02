package INTERFACE;

interface Vehicle1 {
	String type = "Vehicle";
	void start();
}

interface Car1 {
//	String type  = "Car";  // this data member will be ambiguous for Hyundai1 class.
	void start();
}

class Hyundai1 implements Vehicle1,Car1 {
	
	public void start()
	{
		System.out.println("Hyundai Starts!!!!!!!!!!!");
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		
		Vehicle1 v = new Hyundai1();
		v.start();  // upcasting , overriding, abstraction(interface) - implement child method
		System.out.println(v.type);
		Car1 c = new Hyundai1();
		c.start();
		//System.out.println(c.type);
		Hyundai1 h = new Hyundai1();
		h.start();
		System.out.println(h.type);
		
		// TODO Auto-generated method stub

	}

}
