package com.devmanual;

public class Pens {
	 String brand;
	   String color;
	   int price;
	   boolean is_grip;
	   boolean is_tiktok;
	   

	public static void main(String[] args) {
		// Create 1st Pen object i.e. A_Pens
	 Pens A_Pens=new Pens();
	//Updating Values to variables of object -> A_Pens
	
	 A_Pens.color="Blue";
	 A_Pens.price=12;
	 A_Pens.is_grip=true;
	 A_Pens.is_tiktok=true;
	 
	 // Print Values of objects variables
	 System.out.println("The Brand of A_Pens is =" +A_Pens.brand);
	 System.out.println("The color pf A_pens is =" +A_Pens.color);
	 System.out.println("The price of A_pens is =" +A_Pens.price);
	 System.out.println("The A_Pens is Gripped  =" +A_Pens.is_grip);
	 System.out.println("The A_Pens is tiktok   =" +A_Pens.is_tiktok);
	 
	 // Create 2nd B_Pens object -> B_Pens
	 Pens B_Pens=new Pens();
	 
	 B_Pens.brand="Reynolds";
	 B_Pens.color="Black";
	 B_Pens.price=5;
	 B_Pens.is_grip=false;
	 B_Pens.is_tiktok=false;
	 
	 // Print Values of objects variables
	 System.out.println("The Brand of B_Pens is =" +B_Pens.brand);
	 System.out.println("The color pf B_pens is =" +B_Pens.color);
	 System.out.println("The price of B_pens is =" +B_Pens.price);
	 System.out.println("The B_Pens is Gripped  =" +B_Pens.is_grip);
	 System.out.println("The B_Pens is tiktok   =" +B_Pens.is_tiktok);
	 System.out.println("\n");

	 
	 // Create 3rd B_Pens object -> B_Pens
	 Pens C_Pens=new Pens();
	 
	 C_Pens.brand="Reynolds";
	 C_Pens.color="Black";
	 C_Pens.price=5;
	 C_Pens.is_grip=false;
	 C_Pens.is_tiktok=false;
	 
	 // Print Values of objects variables
	 System.out.println("The Brand of C_Pens is =" +C_Pens.brand);
	 System.out.println("The color pf C_pens is =" +C_Pens.color);
	 System.out.println("The price of C_pens is =" +C_Pens.price);
	 System.out.println("The C_Pens is Gripped  =" +C_Pens.is_grip);
	 System.out.println("The C_Pens is tiktok   =" +C_Pens.is_tiktok);
	 System.out.println("\n");
	 
	 // Create 4th D_Pens object -> D_Pens
	 Pens D_Pens=new Pens();
	 
	 D_Pens.brand="Bentley";
	 D_Pens.color="Black";
	 D_Pens.price=500;
	 D_Pens.is_grip=true;
	 D_Pens.is_tiktok=true;
	 
	 // Print Values of objects variables
	 System.out.println("The Brand of D_Pens is =" +D_Pens.brand);
	 System.out.println("The color pf D_pens is =" +D_Pens.color);
	 System.out.println("The price of D_pens is =" +D_Pens.price);
	 System.out.println("The D_Pens is Gripped  =" +D_Pens.is_grip);
	 System.out.println("The D_Pens is tiktok   =" +D_Pens.is_tiktok);
	 
	 // Create 5th E_Pens object -> E_Pens
	 Pens E_Pens=new Pens();
	 
	 E_Pens.brand="Parker";
	 E_Pens.color="Black";
	 E_Pens.price=150;
	 E_Pens.is_grip=true;
	 E_Pens.is_tiktok=true;
	 
	 // Print Values of objects variables
	 System.out.println("The Brand of E_Pens is =" +E_Pens.brand);
	 System.out.println("The color pf E_pens is =" +E_Pens.color);
	 System.out.println("The price of E_pens is =" +E_Pens.price);
	 System.out.println("The E_Pens is Gripped  ="   +E_Pens.is_grip);
	 System.out.println("The E_Pens is tiktok   ="   +E_Pens.is_tiktok);
	
	}

}
