
package ObjectClass;

 class Student2 {
        String name;
        int rollno;
	     Student2(String name, int rollno)
	     {
	    	this.name=name;
	    	this.rollno=rollno;
	     }
	     
	     public int hashCode()  //this function converts hashcode of the object provided by JVM complier into integer form.
	     {
	    	  return rollno;
	     }
	     public boolean equals(Object obj) //equal(object obj) function is used to compare hashcodes.
	     {
	    	   if(this==obj)
	    	   {
	    		   return true;
	    	   }
	    	   else
	    	   {
	    		   return false;
	    	   }
	     }
	  static void display(Student2 s1,Student2 s2)
	     {
	    	 if(s1.hashCode()==s2.hashCode())
	    	 {
	    		   System.out.println("HashCodes are equal");
	    		   if(s1.equals(s2))
	    		   {
	    			  System.out.println("Both objects are equal"); 
	    		   }
	    		   else
	    		   {
	    			   System.out.println("Both objects are equal!!!");
	    		   } 
	    	 }
	    	else
	    		{
	    			System.out.println("Both objects are not equal and hashcodes are not equal!!!");
	    		 }
	    	 }
	     }
 
	  class TestStudent2{
		  
	  
	public static void main(String[] args) {
		Student2 s1 = new Student2("KAJOL", 123);
		Student2 s2 = new Student2 ("CHETNA", 123);
		Student2.display(s1,s2);
		// TODO Auto-generated method stub
		
		
   
	}

}
