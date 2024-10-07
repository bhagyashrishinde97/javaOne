package Static;

public class Employee {
	int rollno;
	String name;
  static String company ="TCS";
    Employee(int rollno,String name)
    {
    	this.rollno=rollno;
    	this.name=name;
    }
    public void display()
    {
    	System.out.println(rollno+" "+name+" "+company);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e1=new Employee(1, "Aditya");
    e1.display();
    Employee e2=new Employee(2,"Ashish");
    e2.display();
	}

}
