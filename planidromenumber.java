package day2;

import java.util.Scanner;

public class planidromenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int i = s.nextInt();
		if(ispalindrome(i))
		{
			System.out.println("the number"+i +"is a palindrome");
		}
		else
		{
			System.out.println("the number" + i + "is not palindrome ");
		}

	}
	public static boolean ispalindrome(int i)
	{
		int originalNumber = i;
		int reversedNumber = 0;
		while (i!=0)
		{
			int digit = i % 10;
			reversedNumber = reversedNumber*10+digit;
			i/=10;
		}
		return originalNumber == reversedNumber;
	}

}
