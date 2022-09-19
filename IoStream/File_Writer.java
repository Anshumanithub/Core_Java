package IoStream;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
	
	public static void main(String[] args) throws IOException  {
		
		
		FileWriter f = new FileWriter("D:/xyz.txt");
		
	
		f.write("A");
		f.write("\n");
		f.write("anshuman");
		f.write("pandey");
		
		
		System.out.println("done");
		f.close();
		}
	}
