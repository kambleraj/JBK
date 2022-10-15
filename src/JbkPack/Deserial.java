package JbkPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
FileInputStream fis= new FileInputStream("D:\\state.txt");
ObjectInputStream ois= new ObjectInputStream(fis);
Object o=ois.readObject();
Student s=(Student)o;
System.out.println(s.age);
System.out.println(s.location);
System.out.println(s.name);
	}
	

}
