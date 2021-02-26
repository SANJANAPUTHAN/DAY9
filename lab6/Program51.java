package lab6;

public class Program51 {
public static void main(String[] args) {
	Child c=new Child();
	c.method1(20);
}
}
class MethodOverriding
{
	public int a;
	public void method1(int a)
	{
		System.out.println("called from parent Method.........."+a);
	}
}
class Child extends MethodOverriding
{
	public void method1(int a)
	{
		super.method1(10);
		System.out.println("Child Method......................."+a);
	}
}