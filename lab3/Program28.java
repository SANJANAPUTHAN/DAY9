package lab3;

import java.util.Scanner;

public class Program28 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Season season=new Season();
	String month=sc.next();
	System.out.println(season.predictSeason(month));
}
}
class Season
{
	public String predictSeason(String month)
	{
		if(month.equalsIgnoreCase("January"))
		{
			return "Winter";
		}
		else if(month.equalsIgnoreCase("February"))
		{
			return "Winter";
		}
		else if(month.equalsIgnoreCase("March"))
		{
			return "Spring";
		}
		else if(month.equalsIgnoreCase("April"))
		{
			return "Spring";
		}
		else if(month.equalsIgnoreCase("May"))
		{
			return "Spring";
		}
		else if(month.equalsIgnoreCase("June"))
		{
			return "summer";
		}
		else if(month.equalsIgnoreCase("July"))
		{
			return "summer";
		}
		else if(month.equalsIgnoreCase("August"))
		{
			return "summer";
		}
		else if(month.equalsIgnoreCase("September"))
		{
			return "Autumn";
		}
		else if(month.equalsIgnoreCase("October"))
		{
			return "Autumn";
		}
		else if(month.equalsIgnoreCase("November"))
		{
			return "Autumn";
		}
		else if(month.equalsIgnoreCase("December"))
		{
			return "Winter";
		}
		return "pls enter proper month";
	}
}