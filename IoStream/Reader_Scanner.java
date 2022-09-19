package IoStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Reader_Scanner {
	
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("D:/xyz.txt");
		Scanner sc = new Scanner(reader);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		reader.close();
		
		
	}

}
