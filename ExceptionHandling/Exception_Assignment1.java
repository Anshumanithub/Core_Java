package ExceptionHandling;

public class Exception_Assignment1 {
	public static void main(String[] args) {
		try {
			try {
				String n = null;
				System.out.println(n.length());
			} 
			catch (NullPointerException  e) {
				System.out.println("first");
			}
			String s = null;
			System.out.println(s.length());
			
			} 
		catch (NullPointerException e) {
			try {
				double div = 15/0;
				System.out.println(div);
				
			} 
			catch (ArithmeticException e1) {
				System.out.println("second");
			}
			System.out.println("you can not divide by zero");
		}
		finally {
			try {
				String b = null;
				System.out.println(b.length());
				}
			
			catch (NullPointerException e) {
				System.out.println("third");
			}
			System.out.println("fourth");
		}
	}
	


}
