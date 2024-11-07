package day11;
class car
{
	private String name;
	private int mileage;
	private int cost;
	public void setData(String x, int y,int z)
	{
		name = x;
		mileage = y;
		cost = z;
	}
	public String getName()
	{
		return name;
	}
	public int getMileage()
	{
		return mileage;
	}
	public int getCost()
	{
		return cost;
	}
	
}

public class cardetails {

	public static void main(String[] args) {
		car c = new car();
		c.setData("bmw", 10, 70000000);
		System.out.println(c.getName());
		System.out.println(c.getMileage());
		System.out.println(c.getCost());
	}
}