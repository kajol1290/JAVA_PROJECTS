package ObjectClass;

 class Teacher {
	     String name;
	     int id;
	     Teacher()
	     {
	    	 
	     }
	     Teacher(String name, int id)
	     {
	    	 this.name=name;
	    	 this.id=id;
	     }
	     public int hashCode()
	     {
	    	 return id;
	    	 
	     }
	     public boolean equals( Object obj)
	     { System.out.println("Inside equals() function!!");
	    	 
	    	// return this.hashCode()==obj.hashCode();
	    	 if(this==obj)
	    		 {
	    		    return true;
	    		 }
	    	 else
	    	 {
	    		 return false;
	    	 }
	     }
}
class Data extends Teacher
{
	static void insertData(Teacher t1,Teacher t2)
	{
		 if(t1.hashCode()==t2.hashCode())
		 {
			   if(t1.equals(t2))
				{
			      System.out.println("Data already exists");
			
				}
		else
		{
			System.out.println("Data Inserted Successfully");
		}
		 }
			   else
			   {
				   System.out.println("Both objects are not equal!!");
			   }
	}
	}
	     
class TestTeacher  {
	

	public static void main(String[] args) {
		Teacher t1 = new Teacher("KAJOL",123);
		Teacher t2 = new Teacher("KAJOL", 123);
		System.out.println("t1.hasCode()" + t1.hashCode());
		System.out.println("t2.hasCode()" + t2.hashCode());
		Data.insertData(t1,t2);
		// TODO Auto-generated method stub

	}

}
