package Static;

public class Student {
	int rollno; String name;
	static String company="TCS";
}
	static
	{
		System.out.println("Hello");
	}
	public Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+" "+company);
	}
	static void display()
	{
		System.out.println("print methos");
	public static void main(String[] args) {
		Student s1=new Student(1,"Rajesh");
		s1.display();
		Student s2=new Student(2,"Rohit");
	Student.display();
		// TODO Auto-generated method stub

	}

}
