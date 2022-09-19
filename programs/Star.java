package programs;

public class Star {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		
		}
		for(int i=9; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}

}
