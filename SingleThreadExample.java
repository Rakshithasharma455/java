package day19;

public class SingleThreadExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started execution");
		System.out.println("teard is executing");
		Thread.sleep(5000);
		System.out.println("tread is executing");
		Thread.sleep(5000);
		System.out.println("tread is executing");
		Thread.currentThread().interrupt();
		Thread.sleep(5000);
		System.out.println("Main tread completed execution");
		
		
		
		}

}
