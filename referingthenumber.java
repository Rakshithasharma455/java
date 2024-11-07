package demo;

class Addition
{
	int c;
	int add(int x,int y)
	{
		c = x+y;
		return c;	
	}
}

public class demo1 {

	public static void main(String[] args) {
		Addition ref = new Addition();
		int a = 10;
		int b = 20;
		
		int res = ref.add(a,b);
		System.out.println(res);
		
		

	}

}
