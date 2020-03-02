package collection;

import java.util.ArrayList;
// Array List
public class Trainer {
	
	String name;
	int id;
    Trainer(String n, int id)
    {
    	this.name=n;
    	this.id=id;
    }
	//public static void main(String[] args) {
		
	public int hashCode()
	{
		return this.id;
		
	}

}
	class Alist {
		public static void main(String [] args)
		{
			
			Trainer t1 = new Trainer("Diganta", 30);
			ArrayList al =new ArrayList();
			al.add(new Trainer("KAJOL",27));// anonymous object
			al.add(new Trainer("Chetna",30));
			al.add(new Trainer("KAJOL",25));
			al.add(new Trainer("KAJOL",27));
			al.add(new Trainer("Jyoti",27));
			al.add(t1);// named object
			
		
		for (Object obj:al)
		{
			Trainer t = (Trainer)obj;  // DownCasting
			System.out.println(t.name+ " "+t.id);
			System.out.println(obj.hashCode());// prints hashcode of trainers class
			  // Object obj = new Trainer
		}
		}
}
