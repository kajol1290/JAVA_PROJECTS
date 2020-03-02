package Scanner;
import java.util.Scanner;

class Employee {
	
	    String name;
	    String email;
	    String add;
	    double phoneno;
	    double sal;
	    String dob;
	    String bloodgr;
	    int empid;
	    String desig;
	    
	    void display()
	    {
	    	  System.out.println("~~~~~~~~~~~~Enter Employee Details~~~~~~~~~~~~~~");
	    	  Scanner sc = new Scanner(System.in);
	    	  System.out.println("Enter employee name :");
	    	  name = sc.nextLine();
	    	  System.out.println("Enter Employee id : ");
	    	  empid = sc.nextInt();
	    	  System.out.println("Enter Employee email address : ");
	    	  email = sc.next();
	    	  System.out.println("Enter Employee designation : ");
	    	  desig = sc.nextLine();
	    	  System.out.println("Enter employee blood group : ");
	    	  bloodgr = sc.next();
	    	  System.out.println("Enter employee Phone no : ");
	    	  phoneno = sc.nextDouble();
	    	  
	    	  
	    	  
	    	  
	    }
}
public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.display();
		// TODO Auto-generated method stub

	}

}
