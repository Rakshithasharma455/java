package gift;

import java.util.Scanner;

public class chocolates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=1;i<=t;i++)
		{
			int c,x,y,a;
			c=sc.nextInt();
			x=sc.nextInt();
			y=sc.nextInt();
			a = c-x;
			System.out.println(a*y);
		}

	}

}
