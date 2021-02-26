package lab4;

import java.util.Scanner;

public class Program37 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Sum.calculateSum(num));
	}
}
class Sum
{
	public static int calculateSum(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=(num%10);
			num=num/10;
		}
		return sum;
	}
}