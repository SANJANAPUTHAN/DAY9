package lab6;

public class Program48 {
public static void main(String[] args) {
	Constructor c=new Constructor();
	Constructor c1=new Constructor(10);
	Constructor c2=new Constructor(10, 20);
}
}
class Constructor
{
	private int a;
	private int b;
	public final int getA() {
		return a;
	}
	public final void setA(int a) {
		this.a = a;
	}
	public final int getB() {
		return b;
	}
	public final void setB(int b) {
		this.b = b;
	}
	public Constructor()
	{
		System.out.println("Default constructor.........");
	}
	public Constructor(int a)
	{
		this.a=a;
		System.out.println("Constructor with one parameter........."+this.a);
	}
	public Constructor(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor with two parameter........."+this.a+"  "+this.b);
	}
}