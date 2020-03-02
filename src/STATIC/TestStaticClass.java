package STATIC;



//~~~~~~~~~~~~~~~~~~~~~~~~~CASE 1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class StaticClass {
	   String name;
	   int age;
	   static String coname;
void display()
{
	    System.out.println("Name = " +name + ", age = " +age + ", Company name = " +StaticClass.
	    		coname);
}
}
	  
	   
class TestStaticClass {
	public static void main(String[] args) {
	
	  StaticClass SC = new StaticClass();
	  SC.name = "KAJOL";
	  SC.age = 27;
	    SC.display();
		
		// TODO Auto-generated method stub

	}
	

}   


