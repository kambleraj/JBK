package JbkPack;

public class StaticVar {
static int i=10;
int b=20;
void display()
{
	
System.out.println(i);	
}
static void show()
{
	System.out.println(i);
	
	}
public static void main(String[] args) {
	StaticVar k=new StaticVar();
	k.show();
	k.display();
	StaticVar k1=null;
	k1.show();
	k1.display();
}
}
