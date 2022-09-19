package IoStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File_Writer1 {
	public static void main(String[] args) throws Exception {
		
		FileWriter f = new FileWriter("D:/xyz.txt");
		PrintWriter pw = new PrintWriter(f);
		
		
		for (int i=0;i<5;i++) {
		    pw.println( i +":anshuman");
		  }
		pw.close();
		 f.close();
		
		System.out.println("Done");
		
	 }

}
