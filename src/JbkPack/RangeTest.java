package JbkPack;

import java.util.Scanner;

public class RangeTest {
public static void main(String[] args) {
	System.out.println("Enter no");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	if(no>1 && no<7)
	{
		System.out.println("in range");
	}
	else
		System.out.println("out of range");
}
}
