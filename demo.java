package tyre;
class student
{
	private String name;
	private int standard;
	student(String name,int standard)
	{
		this.name = name;
		this.standard = standard;
	}
	public String getName() {
		return name;
	}
	public int getStandard() {
		return standard;
	}
}
class book
{
	private String name;
	private String author;
	public book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}
class library
{
	book b = new book("The White Tiger","Aravind Adiga");
	void hasA (student s)
	{
		System.out.println(s.getName());
		System.out.println(s.getStandard());
	}
			
}
public class demo {

	public static void main(String[] args) {
		student s = new student("rakshi",10);
		library l = new library();
		System.out.println(l.b.getName());
		System.out.println(l.b.getAuthor());
		l.hasA(s);
		l=null;
		
	}

}
