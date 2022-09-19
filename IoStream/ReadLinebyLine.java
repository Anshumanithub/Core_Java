package IoStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadLinebyLine {
	public static void main(String[] args) throws Exception  {
	
		FileReader r =  new FileReader("D:/xyz.txt");
		BufferedReader in = new BufferedReader(r);
		
		String line  =  in.readLine();
		
		while (line!=null) {
		System.out.print(line);
		
		line =  in.readLine();
		
			} in.close();
			
	}
}
			
			
		


