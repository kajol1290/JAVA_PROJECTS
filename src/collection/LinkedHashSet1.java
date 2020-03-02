package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
//1/ It contains unique elements, no duplicate elements.
	//2. It follows the insertion order.
	//3. It allows null elements.
	public static void main(String[] args) {
		 
	LinkedHashSet<String >lh = new LinkedHashSet<String>();
	 lh.add("KAJOL");
	 lh.add("CHETNA");
	 lh.add("");
	 lh.add("SHREYA");
	 lh.add("SHREYA");
	 lh.add("");
	 lh.add("JYOTI");
	 
	 
	 
	 
	 Iterator itr = lh.iterator();
	 
	 while(itr.hasNext())
			 {
		 System.out.println(itr.next());
			 }


	}

}
