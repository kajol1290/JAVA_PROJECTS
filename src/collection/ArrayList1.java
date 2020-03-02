package collection;


	import java.util.*;  
	class ArrayList1{  
	public static void main(String args[]){  
		// Arraylist is a dynamic array which is used to elements of different data types.
		// it follows the insertion order and is not synchronized.
		// It stores duplicate elements.
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	
	list.add("Ravi");//Adding object in arraylist  
	list.add("Vijay");  
	list.add("Ravi");  
	list.add("Ajay");  
	
	//Traversing list through Iterator  
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  