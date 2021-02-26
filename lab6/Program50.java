package lab6;

public class Program50 {
public static void main(String[] args) {
	B b=new B();
	System.out.println(b.a);
	b.method1();
	b.method2();
}
}
class A
{
	public int a;
	A(){};
	A(int a)
	{
		this.a=a;
	}
	public void method1()
	{
		System.out.println("Method from A..........");
	}
}
class B extends A
{
	public int b;
	B(int b)
	{
		this.b=b;
	}
	public B() {
		// TODO Auto-generated constructor stub
	}
	public void method2()
	{
		System.out.println("Method from B.........");
	}
}