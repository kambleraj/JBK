package JbkPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOLab1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C://myvc1//1.txt");
		int i;
		while ((i = fis.read()) != -1) {
			char c = (char) i;
			System.out.println(c);
		}
		
		fis.close();
	
FileOutputStream fout= new FileOutputStream("C://myvc1//2.txt");


String s= "rajendra omaji kamble";
byte b[]=s.getBytes();
fout.write(b);
System.out.println("suecess writtem");

fout.close();
}}
