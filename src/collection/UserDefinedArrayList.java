package collection;

import java.util.ArrayList;
import java.util.Iterator;
// user defined array list of class objects
class Student1
{
	  String name;
	  int age;
	  
	  Student1(String n, int a)
	  {
		  this.name=n;
		  this.age=a;
	  }
}

public class UserDefinedArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student1> a1 = new ArrayList<Student1>();
		a1.add(new Student1("KAJOL", 27));
		a1.add(new Student1("Chetna",30));
		a1.add(new Student1("Chetna",30));
		a1.add(new Student1("Shreya",32));
		
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			 Student1 st = (Student1)itr.next();
			System.out.println(st.name+ " " +st.age);
		}
		
		
         
		
		

	}

}
