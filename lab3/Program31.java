package lab3;

import java.util.Scanner;

public class Program31 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers.....");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Enter operation.........");
	String str=sc.next();
	switch(str)
	{
	case "+":
		System.out.println("Addition....."+(a+b));
		break;
	case "-":
		System.out.println("Subtraction..."+(a-b));
		break;
	case "*":
		System.out.println("Multiplication.."+(a*b));
		break;
	case "/":
		System.out.println("Division........."+(a/b));
		break;
	default:
		System.out.println("not possible...........");
	}
}
}
