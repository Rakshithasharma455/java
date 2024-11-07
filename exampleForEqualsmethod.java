package day11;

import java.util.Objects;

public class exampleForEqualsmethod {
	int age;
	exampleForEqualsmethod(int age)
	{
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		exampleForEqualsmethod other = (exampleForEqualsmethod) obj;
		return age == other.age;
	}


	public static void main(String[] args) {
		exampleForEqualsmethod e = new exampleForEqualsmethod(20);
		exampleForEqualsmethod e1 = new exampleForEqualsmethod(25);
		System.out.println(e==e1);
		System.out.println(e.equals(e1));
	

	}

}
