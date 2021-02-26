package lab5;

import java.util.Scanner;

public class Program43 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	int size=sc.nextInt();
	System.out.println("Enter array elements...");
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<size;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
		if(max<arr[i])
		{
			max=arr[i];
		}
	}
	System.out.println("minimum....."+min);
	System.out.println("maximum....."+max);
	}
}
