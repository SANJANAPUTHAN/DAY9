package lab5;

import java.util.Scanner;

public class Program44 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	int size=sc.nextInt();
	System.out.println("Enter array elements...");
	int arr[]=new int[size];
	int brr[]=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		brr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(arr[i]);
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(brr[i]);
	}
	for(int i=0;i<size;i++)
	{
		arr[i]=arr[i]+brr[i];
		brr[i]=arr[i]-brr[i];
		arr[i]=arr[i]-brr[i];
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(arr[i]);
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(brr[i]);
	}
}
}