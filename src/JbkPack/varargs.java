package JbkPack;

public class varargs {
void m1(String...s)
{
System.out.println("in m1");
for(String value:s)
{
	System.out.println(value);
	}
}
public static void main(String[] args) {
	varargs l= new varargs();
	l.m1();
	l.m1("www");
	l.m1("www",".","kiran");
}
}
