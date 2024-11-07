package method;
class Calculator
{
	int add (int a, int b)
	{
		return a+b;
	}
	int add (int a,int b,int c)
	{
		return a+b+c;
	}
	double add (double a,double b)
	{
		return a+b;
	}
}

  
 
public class exofmethds {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int a=10,b=20,c=10;
		double m=1.1,n=2.2;
		System.out.println(cal.add(a, b));
		System.out.println(cal.add(a, b,c));
		System.out.println(cal.add(m,n));

	}

}
