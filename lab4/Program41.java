package lab4;

import java.util.Scanner;

public class Program41 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int column=sc.nextInt();
		int value=0;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(value++);
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("0 ");
			}
			System.out.println();
		}
		
	}

}
