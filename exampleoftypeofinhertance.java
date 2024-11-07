package day1;
class Plane
{
void takeoff()
  {
	System.out.println("Plane is taking off");
   }

void fly()
    {
	System.out.println("plane is flying");
	}
void land()
{
	System.out.println("plane is landing");
}
void carry()
{ 
	System.out.println("plane is carry weapon");
}
}
class  CargoPlane extends Plane {
	void fly()
	{
		System.out.println("plane is flying at low height");
		System.out.println("CargoPlane carries cargo");
	}
}
class PassengerPlane extends Plane{
	void fly()
	{
		System.out.println("plane is flying at medium height");
		System.out.println("PassengerPlane carries passenger");
	}
}
class FighterPlane extends Plane
{
	void fly ()
	{
		System.out.println("plane is flying at higher height");
		System.out.println("FighterPlane carries weapons");
	}
}
public class exampleoftypeofinhertance {

	public static void main(String[] args) {
	CargoPlane cp = new CargoPlane();
	PassengerPlane pp = new PassengerPlane();
	FighterPlane fp = new FighterPlane();
	cp.takeoff();
	cp.fly();
	cp.land();
	cp.carry();
	pp.takeoff();
	pp.fly();
	pp.land();
	pp.carry();
	fp.takeoff();
	fp.fly();
	fp.land();
	fp.carry();

	}

}

