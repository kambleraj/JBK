package JbkPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap hm=new TreeMap();
hm.put("101", "java");
hm.put("102","net");
hm.put(null,null);

Object o=hm.put("103", "c++");
System.out.println(o);
Object o1=hm.put("103","c");
System.out.println(o1);
Set s= hm.keySet();

Iterator itr=s.iterator();
while(itr.hasNext())
{
String me=  (String)itr.next();	
System.out.println(me);
System.out.println(hm.get(me));
}
	}

}
