package lab3;

import java.util.Scanner;

public class Program29 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Vowel v=new Vowel();
	char vowel=sc.next().charAt(0);
	System.out.println(v.checkVowel(vowel));
}
}
class Vowel
{
	public String checkVowel(char vowel)
	{
		switch(vowel)
		{
		   case 'a' :
		   case 'e' :
	       case 'i' :
		   case 'o' :
		   case 'u' :
		   case 'A' :
		   case 'E' :
		   case 'I' :
		   case 'O' :
		   case 'U' :
			   return "VOWEL";
		}
		return "CONSONANT";
	}
}
