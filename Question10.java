
public class Question10 {
	public static void main(String[] args) {
		
		int a = 153,  leng = 0;
		int temp_1 = a;
		
		while (temp_1 !=0) {
			temp_1 = temp_1/10;
			leng = leng + 1;
		}
		
		int temp_2 = a, arm = 0, rem;
		
		while (temp_2 !=0) {
			
			rem = temp_2 % 10;
			int mult = 1;
			
			for( int i = 1; i<=leng; i++ ) {
				mult = mult * rem;
				
			}
			arm = arm + mult;
			temp_2 = temp_2 / 10;
			
		}
		if (a==arm) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
		
		
			
		}
			
	}


