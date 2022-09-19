package IoStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


public class BinaryFile {
	
	 public static void main(String[] args) throws Exception  {
		 
		 
		 //InputStreamReader f = new InputStreamReader(System.in) ; 
		 FileInputStream f = new FileInputStream("D:/satna.txt");
		 FileOutputStream out = new FileOutputStream("D:/satna2222.txt");
		 
		 int ch = f.read();
		 while(ch!=-1) {
			 out.write(ch);
		 ch = f.read();
		 }
		 
		 
		 System.out.println("done");
		 f.close();
		 out.close();
		 
		 }
}
