package programs;

public class Swapping {

	public static void main(String[] args) {
		
	    int x = 100;
	    int y = 200;
	     System.out.println("Before swapping numbers are = "+x+" "+y);
	    
	   x=x+y; // x=100+200 = 300
	   y=x-y; // y=300-200 = 100
	   x=x-y; // x=300-100 = 200
	    
	    System.out.println("After swapping numbers are = " + x + " "+y );
		 }   

}
