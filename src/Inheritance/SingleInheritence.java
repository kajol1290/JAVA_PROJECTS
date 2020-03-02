package Inheritance;
class Room
{
	  int length;
	  int breadth;
	  Room (int l , int  b)
	  {
		   length = l;
		   breadth = b;
	  }
	  
	  int area()
	  {
		  int ar = length*breadth;
		  return ar;
	  }
}
class BedRoom extends Room {
	   
	int height;
	   BedRoom(int l, int b, int h) 
       {
		   super(l,b);   //The constructor in the derived class uses the "SUPER" keyword to pass values that are required
		                   // by the base constructor.
		   height = h;
	   }
       
       int volume()
       {
    	   int vol  = length * breadth * height;
    	   return vol;
       }
	   
}
class SingleInheritence {

	public static void main(String[] args) {
		BedRoom B = new BedRoom(2,5,7);
		int area1 = B.area();           // superclass method
		int volume1 = B.volume();       // baseclass method
		System.out.println("Area is = " +area1);
		System.out.println("Volume is = " +volume1);

	}

}
