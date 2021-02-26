package lab3;

import java.util.Scanner;

public class Program30 {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	Seasons season=new Seasons();
	String month=sc.next();
	System.out.println(season.predictSeason(month));
	}
}
class Seasons
{
	public String predictSeason(String month)
	{
		switch(month)
		{
		case "January":
		{
			return "Winter";
		}
		case "February":
			return "Winter";
		case "March":
			return "Spring";
		case "April":
			return "Spring";
		case "May":
			return "Spring";
		case "June":
			return "Summer";
		case "July":
			return "Summer";
		case "August":
			return "Summer";
		case "September":
			return "Autumn";
		case "October":
			return "Autumn";
		case "November":
			return "Autumn";
		case "December":
			return "Winter";
		default:
			return "Enter month properly";
		}
	}
}