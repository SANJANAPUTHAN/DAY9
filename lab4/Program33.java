package lab4;

import java.util.Scanner;

public class Program33 {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	Even even=new Even();
	int value=sc.nextInt();
	even.generateEven(value);
	}
}
class Even
{
	public void generateEven(int value)
	{
		for(int i=0;i<=value;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}