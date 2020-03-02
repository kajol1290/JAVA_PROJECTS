package com.devmanual;

 class Building2 {
	int floors;
	int rooms;
	int windows;
	double sqft;
	boolean is_garden;
	boolean is_pool;

  Building2( int f, int r, int w, double sqft, boolean ig, boolean ip)
  {
	  System.out.println("Building Specifications : FLOORS = " +f+  ", ROOMS = " +r + ",  Area = " +sqft + ", Garden is there? = " 
			              +ig + ", Pool is there? = " + ip + ".");
	   
  }
}
class TestBuildingContr {
		
	public static void main(String args[]) {
		
	      Building2 B1=new Building2(3,8,3,80.50, true, true);
	      Building2 B2=new Building2(5,8,10,100.50, false, true);
	      
	}
	
	
}

	      
	      

	


