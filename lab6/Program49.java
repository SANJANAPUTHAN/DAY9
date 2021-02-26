package lab6;

public class Program49 {
public static void main(String[] args) {
	Box box=new Box(30,20,10);
	System.out.println(box.calculateVolume());
}
}
class Box
{
	private int length;
	private int breadth;
	private int height;
	public Box(int length,int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public final int getLength() {
		return length;
	}
	public final void setLength(int length) {
		this.length = length;
	}
	public final int getBreadth() {
		return breadth;
	}
	public final void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public final int getHeight() {
		return height;
	}
	public final void setHeight(int height) {
		this.height = height;
	}
	public int calculateVolume()
	{
		return getLength()*getBreadth()*getHeight();

	}
}