package lab4;

import java.util.Scanner;

public class Program32 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Prime prime=new Prime();
	int value=sc.nextInt();
	System.out.println(prime.prime(value));
}
}
class Prime
{
	public String prime(int value)
	{
		if(value<=1)
		{
			return "Not prime";
		}
		for(int i=2;i<=value/2;i++)
		{
			if(value%i==0)
			{
				return "Not prime";
			}
		}
		return "Prime";
		
	}
}