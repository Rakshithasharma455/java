package day2;

import java.util.Scanner;

public class primenumbercheck {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number:");
	int n = sc.nextInt();
	if(isprime(n))
	{
		System.out.println(n +"is a prime number");
	}
	else
	{
		System.out.println(n + "is not a prime number");
	}

	}
	public static boolean isprime(int n)
	{
		if (n <= 1) {
			return false;
		}
		for(int i =2;i<=Math.sqrt(n);i++)
		{
			if (n%i==0) {
				return false;
			}
		}
		return true;
	
	}
}
