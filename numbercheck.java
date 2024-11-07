package day1;

import java.util.Scanner;

public class numbercheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int number = sc.nextInt();
		if(number>0)
		{
			System.out.println("the number is positive");
		}
		else if(number<0)
		{
			System.out.println("the number is negative");
		}
		else
		{
			System.out.println("the number is zero");
		}
		

	}

}
