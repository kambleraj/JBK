package JbkPack;



public class Prime_demo {
	public static void main(String[] args) {
		int i, m = 0, flag = 0;
		int n = 19;
		m = n / 2;
		//System.out.println(m);
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Number is prime");
		else
			System.out.println("Numer is not prime");
	}

}

