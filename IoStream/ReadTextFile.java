package IoStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("D:/xyz.txt");

		int line = in.read();

		while (line != -1){
			System.out.println((char) line);
			line = in.read();

		}
		in.close();

	}
}
