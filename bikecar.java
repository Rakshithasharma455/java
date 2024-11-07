package tyre;

import java.util.Scanner;

public class bikecar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			int n,m;
			n=sc.nextInt();
			m=sc.nextInt();
			System.out.println(n*2+m*4);
		}

	}

}
