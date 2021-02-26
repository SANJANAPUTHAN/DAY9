package LAB2;

public class program24 {
public static void main(String[] args) {
	Shape square=new Shape();
	System.out.println("Area of square..."+square.calcArea(15));
	Shape rectangle=new Shape();
	System.out.println("Area of square..."+rectangle.calcArea(10,20));
}
}
class Shape
{
	public float calcArea(float size)
	{
		return (float)(4)*size;
	}
	public float calcArea(float length,float breadth)
	{
		return length*breadth;
	}
}