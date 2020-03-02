package com.devmanual;

 class Student_2{
    String Name="KAJOL";
    int rollno=10;
    void display(){
    	System.out.println("Student name is = " +Name);
    	System.out.println("Student rollno = " +rollno);
    }
  
}
	
class University {
	       float exmarks_Eng=62;
	       float exmarks_Digital=65;
	       float exmarks_Analog=68;
	       float exmarks_VLSI=60;
	       float totalexmarks;
	       
	       float calcexmarks()
	       {
	          totalexmarks=exmarks_Eng+exmarks_Digital+exmarks_Analog+exmarks_VLSI;
	          return totalexmarks;
	       }
	       
}
class College {
	   float inmarks_Eng=20;
	   float inmarks_Digital=25;
	   float inmarks_Analog=29;
	   float inmarks_VLSI=28;
	   float totalinmarks;
	   
	   float calcinmarks()
	   {
		 totalinmarks=inmarks_Eng+inmarks_Digital+inmarks_Analog+inmarks_VLSI;
		 return totalinmarks;
	   }
}


	   


class Display{
	
    public static void main(String [] args){
    	//TotalMarks TM1=new TotalMarks();
    	University U2=new University();
    	College C2=new College();
    	Student_2 S1=new Student_2();
    //	Percentage P1=new Percentage();
    	//S1.Name="KAJOL";
    	//S1.rollno=09;
    	S1.display();
    	
    	float c=U2.calcexmarks();
    	System.out.println("Student total external marks =" +c);
    	float b=C2.calcinmarks();
    	System.out.println("Student total internal marks is = " +b);
    	float a=b+c;
    	System.out.println("Student total external marks is = "  +a);
    	//float d=P1.calcperc();
    	float m=(a/400);
    	float n=m*100;
    	System.out.println("Percentage is = "+n);
    	  
    }
}

