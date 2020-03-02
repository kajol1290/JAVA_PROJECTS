package com.devmanual;

public class PensAnonymous {
	
	String brand;
	String logo;
	int price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st names object
     PensAnonymous P1=new PensAnonymous();
     
     P1.brand="Cello";
     P1.logo="LP";
     P1.price=10;
     System.out.println(P1);
     System.out.println("Brand of pen P1 ="+P1.brand);
     System.out.println("Logo of 1st pen is  =" +P1.logo);
	 System.out.println("Price of 1st pen is =" +P1.price);
	 System.out.println("\n");
	 
	 //2nd named object
	 PensAnonymous P2=new PensAnonymous();
	 System.out.println(P2);
	 
	
	 
	 // 3rd named object
	 PensAnonymous P3=new PensAnonymous();
	 System.out.println(P3);
	 
	 

	 // 4th un-named object
	 System.out.println(new PensAnonymous());
	 
	 //5th un-named object
     
	 System.out.println(new PensAnonymous());
	 
	/* PensAnonymous ob;
	 ob=P2;
	 System.out.println(ob);  */
     
	}

}
