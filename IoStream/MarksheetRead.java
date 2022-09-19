package IoStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MarksheetRead {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream("D:/marksheet.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		
		Marksheet m = (Marksheet)o.readObject();
		
		System.out.println(m.name);
		System.out.println("phy-"+m.phy);
		System.out.println("math-"+m.math);
		System.out.println("che-"+m.che);
	
		System.out.println("...............");

		System.out.println("total-->"+m.getTotal());
		System.out.println("percent-->"+m.getPercent());
		
		o.close();
		f.close();
			
	}

}
