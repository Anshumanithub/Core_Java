package programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);{
			
			SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/YYYY");
			String sd = sdf.format(d);
			System.out.println(sd);
			
		}
			
		}
			
}
