package day11;

public class student {
	String name;
	student(String name)
	{
		this.name = name;
	}

	public static void main(String[] args) {
		
		student s1 = new student("Tom");
		student s2 = new student("Jarry");
	
		System.out.println(s1);
		System.out.println(s2);	
		

	}

	@Override
	public String toString() {
		return "student [name=" + name + "]";
	}

}
