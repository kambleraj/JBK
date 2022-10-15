package JbkPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap();
hm.put("101", "java");
hm.put("102","net");
hm.put(null,null);
Object o=hm.put("103", "c++");
System.out.println(o);
Object o1=hm.put("103","c");
System.out.println(o1);
Set s= hm.entrySet();

Iterator itr=s.iterator();
while(itr.hasNext())
{
Entry me=  (Entry) itr.next();	
System.out.println(me.getKey() );
System.out.println(me.getValue());
}
	}

}
