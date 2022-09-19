package programs;

public class TestMethod {

	public int sub (int a, int b) {
		int c = a-b;
		return c;
		
		}
	
	public static void main (String[] args) {
		TestMethod t = new TestMethod ();
				t.sub(5, 6);
		
				System.out.println(t.sub(5, 6));
				
		
		
	}
}
