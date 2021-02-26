package lab4;

import java.util.Scanner;

public class Program36 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println(Reverse.reverseNumber(num));
}
}
class Reverse
{
	public static int reverseNumber(int n)
	{
		int rev=0;
		while(n!=0)
		{
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		return rev;
	}
}