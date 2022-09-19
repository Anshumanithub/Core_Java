package programs;

import java.time.LocalDate;
import java.time.Period;

public class Dob {

	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
		System.out.println(a);
		
		LocalDate Dob = LocalDate.of(2000, 2, 15);
		System.out.println(Dob);
		
		
		Period Diff = Period.between(a, Dob);
		System.out.println(Diff);
	}

}
