package collection;

import java.util.HashSet;
import java.util.Iterator;
// 1.it is a collection of unordered set of elements. 
// 2. it doesn't allows the duplicate value
//3. It doesnot obey the insertion order.
public class HashSet1 {

	public static void main(String[] args) {

		HashSet<String> h1 = new HashSet<String>();
		
		h1.add("RAVI");
		h1.add("VIJAY");
		h1.add("");
		h1.add("SHREYA");
		h1.add("CHETNA");
		h1.add("RAVI");
		h1.add("");
		h1.add("RIYA");
		h1.add("MAYA");
		
		Iterator itr = h1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// accessing through for each loop
		
		for(String st : h1)
		{
			System.out.println(st);
		}
			
		
		
		

	}

}
