package collection;

import java.util.ArrayList;
import java.util.LinkedList;
// Array List

class Student {
	
	String name;
	int age;
	int id;
	
	Student(String n, int a, int id)
	{
		this.name=name;
		this.age=a;
		this.id=id;
	}
}
public class Alist2 {
	
	String name;
	int id;
    Alist2(String n, int id)
    {
    	this.name=n;
    	this.id=id;
    }
	//public static void main(String[] args) {
		
	public int hashCode()
	{
		return this.id;
		
	}


		public static void main(String [] args)
		{
			
			Alist2 t1 = new Alist2("Diganta", 30);
			ArrayList al =new ArrayList();
			al.add(new Trainer("KAJOL",27));// anonymous object
			al.add(new Trainer("Chetna",30));
			al.add(new Trainer("KAJOL",25));
			al.add(new Trainer("KAJOL",27));
			al.add(new Trainer("Jyoti",27));
			al.add(t1);// named object
			System.out.println(al.size());
			
		    LinkedList ls = new LinkedList();
		    ls.add(new Student("KAJOL",23,102));
		    ls.add(new Student("Simran",28,100));
		    System.out.println(ls.size());
		    
		    al.addAll(ls);
		    System.out.println("Size is : "+al.size());
		    
		for (Object obj:ls)
		{
			Student t = (Student)obj;  // DownCasting
			System.out.println(t.name+ " "+t.id);
			System.out.println(obj.hashCode());// prints hashcode of trainers class
			  // Object obj = new Trainer
		}
		
		}
}
