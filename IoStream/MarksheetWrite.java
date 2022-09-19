package IoStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MarksheetWrite {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("D:/marksheet.txt");
		ObjectOutputStream out = new ObjectOutputStream(file); 
		
		Marksheet m = new Marksheet();
		m.name="Nikki";
		m.math= 87;
		m.phy= 93;
		m.che=79;
		m.getPercent();
		m.getPercent();
		
	
		
		out.writeObject(m);
		out.close();
		file.close();
		
		System.out.println("done");
		
		
	}

}
