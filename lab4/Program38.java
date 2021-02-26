package lab4;

import java.util.Scanner;

public class Program38 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	Fibonacci.generateFibonaaci(num);
}
}
class Fibonacci
{
	public static void generateFibonaaci(int num)
	{
		int x=0;
		int y=1;
		System.out.print(x+" "+y+" ");
		for(int i=0;i<num-2;i++)
		{
			int z=x+y;
			System.out.print(z+" ");
			x=y;
			y=z;
		}
	}
}