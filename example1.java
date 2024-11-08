package day1;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = scan.nextInt();
		System.out.println("enter the value of b");
		int b = scan.nextInt();
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("do not divide by 0");
		}
	}
}
