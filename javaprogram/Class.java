package javaprogram;

import java.util.Scanner;

public class Class {
	int rollno;
	String name;
	public void accept()
	{
		int n1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno");
		rollno=sc.nextInt();
	
	System.out.println("Enter Name");
	name=sc.next();
   }
public void display()
{
	System.out.println("Rollno="+rollno);
	System.out.println("Name="+name);
}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Class s1=new Class();
       Class s2=new Class();
       Class s3=new Class();
       s1.accept();
       s2.accept();
       s3.accept();
       s1.display();
       s2.display();
       s3.display();
	}

}
