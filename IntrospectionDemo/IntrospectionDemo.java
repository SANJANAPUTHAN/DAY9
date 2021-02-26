package IntrospectionDemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class IntrospectionDemo {
	public static void main(String[] args) throws Exception{
		PoliceStation police=(PoliceStation)Class.forName("IntrospectionDemo.PoliceStation").getConstructor(new Class[] {String.class}).newInstance("huuj");
		Politician politician =(Politician)Class.forName("IntrospectionDemo.Politician").getConstructor().newInstance();
		police.arrest(politician);
	}

}
class PoliceStation 
{
	public PoliceStation(){
		
	}
	public PoliceStation(String s)
	{
		System.out.println("overloaded..");
	}
	public void arrest(Object accused) throws Exception
	{
		Class c=accused.getClass();
		Field f[]=c.getFields();
		for(Field ff:f)
		{
			System.out.println(ff.getName());
		}
		Field field=c.getField("name");
		System.out.println(field.get(accused));
		
		
		Method method=c.getMethod("socialmethod", new Class[] {int.class});
		String name=(String) method.invoke(accused, new Object[] {Integer.valueOf(100)});
		System.out.println(name);
		
		Field f1=c.getDeclaredField("Name");
		f1.setAccessible(true);
		System.out.println(f1.get(accused));
		
		Method method1=c.getDeclaredMethod("originalmethod", new Class[] {int.class});
		method1.setAccessible(true);
		String name1=(String)method1.invoke(accused,new Object[] {Integer.valueOf(100)});
		System.out.println(name1);
		
		
		}
	}

class Politician
{
	public Politician()
	{
		
	}
	public String name="Good Politician...";
	private String Name="Bad Politician...";
	public String socialmethod(int money)
	{
		return "Good politician money distributed...."+money;
	}
	private String originalmethod(int money)
	{
		return "Corrupted politician";
	}
}