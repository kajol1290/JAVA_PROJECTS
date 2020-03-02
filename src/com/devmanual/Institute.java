package com.devmanual;

class Student_5 {
	  String st_name="KAJOL";
	  
		    void display_1(){
		    	
		    	 System.out.println("Student = " +st_name + " has a doubt");
		    }
		    void display_2(){
		    System.out.println("Student Doubt Cleared");
		    }
		    void display_3(){
		    	System.out.println("Chocolate taken by student");
		    }
		    	void display_4(){
		    		System.out.println("Student shows the toffee");
		    	}
		    }
		    

class Trainer_5 { 
	  String tr_name="AZAM";
	  void display_5(){
		//  System.out.println("------------Inside TRAINER Class---------")
		    System.out.println("Student asks doubt to trainer");
	  }
	     
		  void display_6(){
			  System.out.println("Trainer gave Chocolate");
			  
		  }
		 
}
	  


class Institute {
	 

      public  static void main(String [] args){
	
       Student_5 S1=new Student_5();
       Trainer_5 T1=new Trainer_5();
       S1.display_1();
       T1.display_5();
       S1.display_2();
       T1.display_6();
       S1.display_3();
       S1.display_4();
      
	}

}
