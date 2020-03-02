package ObjectClass;


class Student {
	
	 int rollno;
	 String name;
	 
	 Student(String name, int rollno)
	 {
		 this.rollno=rollno;
		 this.name=name;
	 }
	 public int hashCode()  // overriding hashcode() mmethod of 
	 {
		 // return 10;
		  return rollno; // takes the respective rollno of each object created of type student 
	 }
	 public boolean equals(Object obj)
	 {
		 return this.hashCode()==obj.hashCode();
	 }
}
public class TestStudent {

	public static void main(String[] args) {
		Student s1= new Student("KAJOL", 12);
		Student s2 = new Student("Priya",45);
		System.out.println("s1.toString() : "+s1.toString());
		System.out.println("s1            : "+s1);
		System.out.println("s2.toString() : "+s2.toString());
		System.out.println("s2            : "+s2);
		System.out.println("s1.hashCode() : "+ s1.hashCode());
		System.out.println("s2.hashCode() : "+s2.hashCode());
		System.out.println("s1.equals()   : "+s1.equals(s2));
		System.out.println("s1.getClass() : "+s1.getClass());
		System.out.println("s2.getClass() : "+s2.getClass());
		
		// TODO Auto-generated method tub

	}

}
