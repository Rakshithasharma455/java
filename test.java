package day12;

public class test {
	void registerstudent(student s)
	{
		System.out.println(s.getName());
	}

	public static void main(String[] args) {
		
		student s = new student();
		s.setName("rakshitha");
		test t = new test();
		t.registerstudent(s);
		

	}

}
