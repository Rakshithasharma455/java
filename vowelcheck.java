package day2;

import java.util.Scanner;

public class vowelcheck {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in); 
		System.out.println("enter the string");
		String s = sc.nextLine();
		if (containsvowel(s))
		{
			System.out.println("the string contains the vowel letter");
		}
		else
		{
			System.out.println("the string does not contains the vowel letter");
		}
	}
	public static boolean containsvowel(String s)
	{
		for(char ch : s.toLowerCase().toCharArray())
		{
			if(ch == 'a'||ch == 'e'|| ch == 'i'|| ch == 'O' || ch == 'u')
			{
				return true;
			}
		
		}
		return false;
	}

}
