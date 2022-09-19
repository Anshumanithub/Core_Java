package IoStream;

import java.io.File;

public class ReadfileAttribute {
	public static void main(String[] args) {
		File f = new File ("D:/read.txt");
		
		if(f.exists()) {
			System.out.println("Anshuman"+f.getName());
			System.out.println("");
		}
		
	}

}
