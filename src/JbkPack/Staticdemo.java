package JbkPack;

public class Staticdemo {
	int a = 10;
	static int b = 10;

	public static void main(String[] args) {
		Staticdemo s = new Staticdemo();
		System.out.println(s.a);
		System.out.println(s.b);
		Staticdemo s1 = new Staticdemo();
		int x = s1.a++;
		int y = s1.b++;
		System.out.println(x);
		System.out.println(y);

		Staticdemo s2 = new Staticdemo();
		int p = s2.a++;
		int q = s2.b++;
		System.out.println(p);
		System.out.println(q);
		Staticdemo s3 = new Staticdemo();
		int c = s3.a++;
		int d = s3.b++;
		System.out.println(c);
		System.out.println(d);
	}

}
