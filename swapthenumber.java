package day1;

import java.util.Scanner;

public class swapthenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		a=sc.nextInt();
		b=sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swapping ,a is " +a + " and b is "+b);
		

	}

}
