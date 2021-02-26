package lab4;

import java.util.Scanner;

public class Program39 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int i=1;
	do
	{
		System.out.println(i+" * "+" "+num+" ="+i*num);
		i++;
	}while(i<=10);
}
}
