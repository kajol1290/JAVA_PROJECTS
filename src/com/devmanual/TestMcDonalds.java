 package com.devmanual;

 class McDonalds {
	  String name1;
	  String name2;
	  int price;
	  String drink1;
	  String drink2;

	  void food(String name1,String drink1, int price)
		{
        System.out.println("Food name = " +name1 + ", Price = " +price + ", drink = " +drink1);
	}
		void food(String name1,String name2,String drink1,String drink2, int price)
		{
			System.out.println("Combo pack: Item 1 = name = " +name1 +  ", Item 2  = " +name2 + ", Drink 1 = " +drink1 + "\n"
			                  + "            Drink 2 = " +drink2 + ", Price = " +price );
		}
     
 }
 
class TestMcDonalds
{
	public static void main(String[] args) {
		  McDonalds MD = new McDonalds();
		  MD.food("McVeggie Burger", "Mc Float", 300);
		  MD.food("Mc ChickenCheese Burger", "MC VeggiesDelight burger" , "Pepsi","Mc Float", 1000);
		 }
	
}	
		