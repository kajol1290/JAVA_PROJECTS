package INTERFACE;


interface Switch {
	
	 void switchOn(); // members of interface are public by default.
	 void switchOff();
	 
}

class Bulb implements Switch 
{
	 public void switchOn() // if no public access specifier , inside class by default methods are package type
	 // so we need to declare them as public as for overriding methods, the visibility of overriding method must be 
	  // greater of visibility of overridden method. Increasing order of visibility
	 // is : Private -> Default -> Protected -> public.
	 {
		 System.out.println("Bulb switched ON!!!");
	 }
	public  void switchOff()
	 {
		 System.out.println("Bulb switched OFF!!!");
	 }
	 
}
class Fan implements Switch
{
	public void switchOn()
	{
		System.out.println("Fan Switched ON!!!");
	}
	public void switchOff()
	{
		 System.out.println("Fan Switched OFF!!!");
	}
}
public class TestSwitch {

	public static void main(String[] args) {
		Switch s = new Bulb();
		s.switchOn();
		s.switchOff();
		
		Switch s2 = new Fan();
		s2.switchOn();
		s2.switchOff();
		
		
		// TODO Auto-generated method stub

	}

}
