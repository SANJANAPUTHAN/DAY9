package lab6;

public class Program54 {
public static void main(String[] args) {
	sample s=new sample();
	s.method(10);
}
}
interface base
{
	public static final int a = 0;
	public void method(int a);
}
class sample implements base
{

	@Override
	public void method(int a) {
		// TODO Auto-generated method stub
		System.out.println("Value for a is -------------> "+a);
	}
	
}