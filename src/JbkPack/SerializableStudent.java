package JbkPack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableStudent {
public static void main(String[] args) throws IOException {
	Student s= new Student();
	s.age=10;
	s.location="pune";
	s.name="raju";
	FileOutputStream fos= new FileOutputStream("D:\\state.txt");
	ObjectOutputStream  oos= new ObjectOutputStream(fos);
	oos.writeObject(s);
	oos.flush();
	System.out.println("serial done");
	
}
}
