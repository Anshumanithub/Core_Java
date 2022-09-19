package ExceptionHandling;

public class Exception {
	
	public static void main(String[] args) {
	
		try {
		
			double div = 15/0;
			System.out.println(div);	
		}
		catch (ArithmeticException e) {
		System.err.println("you cannot divide by zero");
			
	 }

   } 
}

