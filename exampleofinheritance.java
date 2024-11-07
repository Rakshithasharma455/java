package day1;
class CreditCard
{
	int CardNo = 1234567;
	int pin = 3333;
}
class Hacker extends CreditCard
{
	void viewDetails()
	{
		System.out.println("Card Number:"+ CardNo);
		System.out.println("pin Number:"+ pin);	
	}
	void ChangeDetails()
	{
		CardNo = 23456;
		pin = 4444;
	}
}

public class exampleofinheritance {

	public static void main(String[] args) {
		
		Hacker h = new Hacker();
		h.viewDetails();
		h.ChangeDetails();
		h.viewDetails();

	}

}
