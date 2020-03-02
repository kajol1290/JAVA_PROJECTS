package String;

public class StringBufferClassMethods {

	public static void main(String[] args) {
		
		StringBuffer s1  = new StringBuffer("SACHIN");
		
	   // s1.insert(2, "TEN");  //Insert
	    
	    System.out.println(s1);
	    
	    s1.append("TENDULKAR");  //Append
	    System.out.println(s1);
	    
	    s1.reverse(); //Reverse
	    System.out.println(s1);
	    
	    s1.delete(1, 3);  // startIndex is mutually inclusive and endIndex is mutually exlusive
	    System.out.println(s1);
	    
	   int cap = s1.capacity();  //capacity
	    System.out.println(cap);
	    
	    s1.append("java is my fav subject to study");
	    int cap2 = s1.capacity();
	    System.out.println(cap2);//46
	    s1.ensureCapacity(45);// 46
	    s1.ensureCapacity(46);//46
	    s1.ensureCapacity(47);//94 = (46*2)+2
	    System.out.println(s1.capacity());
	    
	    
		
		

	}

}
