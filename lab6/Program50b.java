package lab6;

public class Program50b {
public static void main(String[] args) {
	class3 c=new class3();
	c.method();
	c.method2();
	c.method3();
}
}
class class1
{
	public int a;
	public void method()
	{
		System.out.println("method 1 from A............");
	}
}
class class2 extends class1
{
	public int b;
	public void method2()
	{
		System.out.println("method2 from B.............");
	}
}
class class3 extends class2
{
	public int c;
	public void method3()
	{
		System.out.println("method3 from c..............");
	}
	
}