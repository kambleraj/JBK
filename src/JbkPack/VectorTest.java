package JbkPack;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v= new Vector();
System.out.println(v.size());
System.out.println(v.capacity());
Vector v1= new Vector(2);
System.out.println(v1.size());
System.out.println(v1.capacity());
v1.add("aple");
v1.add("mango");
v1.add("grapes");
System.out.println(v1.size());
System.out.println(v1.capacity());
Enumeration e=v1.elements();
while(e.hasMoreElements())
{
	String elemnt=(String) e.nextElement();
	System.out.println(elemnt);
}
	}

}
