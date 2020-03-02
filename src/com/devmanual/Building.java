package com.devmanual;

public class Building {
	byte floors=100;
	int rooms;
	int windows;
	double sqft;
	boolean is_garden;
	boolean is_pool;


		
	public static void main(String args[]) {
		
	      Building Kejo_Building=new Building();
	      Kejo_Building.floors=10;
	      Kejo_Building.rooms=55;
	      Kejo_Building.windows=110;
	      Kejo_Building.sqft=11000.0;
	      Kejo_Building.is_garden=true;
	      Kejo_Building.is_pool=true;
	      
	      System.out.println("Kejriwals building is ready. It  has specifications");
	      System.out.println("floors =" +Kejo_Building.floors);
	      System.out.println("rooms =" +Kejo_Building.rooms);
	    /*  System.out.println("windows =)
	      System.out.println
	      System.out.println
	      System.out.println  */
	      Building Modi_Building=new Building();
	      Modi_Building.floors=20;
	      System.out.println("Modi's building has floor =" +Modi_Building.floors);
	    //  System.out.println(Building.floors());
	      System.out.println(new Building());
	     /* VisitingCard VC1=new VisitingCard();
	      VC1.ename="Chetna";
	      System.out.print("The name is" +VC1.ename);  */
	     
	}
	
	
}

	      
	      

	


