package IoStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadfromKeyboard {
	public static void main(String[] args) throws Exception {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		
		PrintWriter p = new PrintWriter("D:/indore.txt");
		
		String s = b.readLine();
		while(!s.equals("quit")) {
			p.println(s);
			s = b.readLine();
		}
		p.close();
		b.close();
	}

}
