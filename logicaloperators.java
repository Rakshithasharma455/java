package day2;

import java.util.Scanner;

public class logicaloperators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter th number:");
		int n = s.nextInt();
		if (n % 5 == 0 && n % 3 == 0)
		{
			System.out.println("the number "+ n + "divisiable by both 3and 5" );
		}
		else
		{
			System.out.println("the number" + n + "is not divisiable by both 3 and 5");
		}
	}

}
