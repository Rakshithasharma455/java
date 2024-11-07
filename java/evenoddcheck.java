package day1;

import java.util.Scanner;

public class evenoddcheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number:");
		int number = sc.nextInt();
		if(number%2 == 0)
		{
			System.out.println(number + "is even");
		}
		else
			System.out.println(number +"is odd");

	}

}
