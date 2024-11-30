package day19;
class Print implements Runnable {
	synchronized public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +" is printing");
		for(int i=0;i<=0;i++)
		{
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("something occured");
		}
		}
		System.out.println(name +" completed printing");
	}
}
public class Printer {

	public static void main(String[] args) throws InterruptedException {
		Print pr =  new Print();
		Thread t1 = new Thread(pr);
		Thread t2 = new Thread(pr);
		Thread t3 = new Thread(pr);
		t1.setName("rakshitha");
		t2.setName("poornima");
		t3.setName("aryan");
		t1.start();
		t2.start();
		t3.start();
	}

}
