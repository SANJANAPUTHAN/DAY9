package lab4;

import java.util.Scanner;

public class Program34 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Odd odd=new Odd();
	int value=sc.nextInt();
	System.out.println(odd.calculateAverage(value));
}
}
class Odd
{
	public float calculateAverage(int value)
	{
		float average=0.0f;
		int count=0;
		for(int i=0;i<value;i++)
		{
			if(i%2!=0)
			{
			average+=i;
			count++;
			}
		}
		average=average/count;
		return average;
	}
}