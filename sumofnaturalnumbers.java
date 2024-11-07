package day1;

import java.util.Scanner;

public class sumofnaturalnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int i=0;i<testcase;i++)
		{
			int n = sc.nextInt();
			int sum = 0;
			for(int j=1;j<=n;j++)
			{
				sum +=j;
			}
			System.out.println(sum);
		}

	}

}
