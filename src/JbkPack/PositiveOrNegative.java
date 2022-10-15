package JbkPack;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter no");
int no=scan.nextInt();
System.out.println(no);
String str=String.valueOf(no);
if(str.charAt(0)=='-')
{
System.out.println("negative");	
}
else
	System.out.println("positive");
	}

}
