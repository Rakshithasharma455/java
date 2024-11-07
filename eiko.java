package bread;

import java.util.Scanner;

public class eiko {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		int m,n,k;
		n = sc.nextInt();
		m= sc.nextInt();
		k=sc.nextInt();
		System.out.println(k*m);
		
		if( k*m>=n)
		{
			System.out.println("yes");
		}	
		else
		{
			System.out.println("no");
		}
			

	}

}
}
