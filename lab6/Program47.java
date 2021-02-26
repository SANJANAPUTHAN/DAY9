package lab6;

public class Program47 {
public static void main(String[] args) {
	MethodOverloading method=new MethodOverloading();
	System.out.println("Addition of two numbers---------->"+method.add(5,10));
	System.out.println("Addition of three numbers-------->"+method.add(5,10,15));
	System.out.println("Addition of four numbers--------->"+method.add(5,10,15,20));
}
}
class MethodOverloading
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
}