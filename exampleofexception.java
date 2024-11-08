package day1;


public class exampleofexception {

	public static void main(String[] args) {
		
		int a[] = {10,20,30};
		try {
		     System.out.println(a[1]);
			 System.out.println(a[99]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invalid index");
		}
		
	}

}
