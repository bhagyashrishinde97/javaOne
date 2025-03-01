package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator {
    private String firstname;
    private String lastname;
    private int salary;
    public EmployeeComparator(String firstname,String lastname,int salary)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;

    }
    public EmployeeComparator()
    {
        super();
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeComparator{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class Sorting implements Comparator<EmployeeComparator> {


    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
    class Getlastname implements Comparator<EmployeeComparator>
    {

        @Override
        public int compare(EmployeeComparator o1, EmployeeComparator o2) {
            return o1.getLastname().compareTo(o2.getLastname());
        }
    }
    class Firstname implements Comparator<EmployeeComparator>
    {

        @Override
        public int compare(EmployeeComparator o1, EmployeeComparator o2) {
            return o1.getFirstname().compareTo(o2.getFirstname());
        }
    }



    class Employee
    {
        public static void main(String[] args) {
            List<EmployeeComparator> list=new ArrayList<>();
            EmployeeComparator emp1=new EmployeeComparator("Aditi","Bhosale",55000);
            EmployeeComparator emp2=new EmployeeComparator("Bhagyashri","Shinde",85000);
            EmployeeComparator emp3=new EmployeeComparator("Sachin","Shinde",35000);
            EmployeeComparator emp4=new EmployeeComparator("Pravin","Shewale",65000);
            EmployeeComparator emp5=new EmployeeComparator("Vaibhav","Patil",75000);
            EmployeeComparator emp6=new EmployeeComparator("Shrikant","Biradar",95000);
            list.add(emp1);
            list.add(emp2);
            list.add(emp3);
            list.add(emp4);
            list.add(emp5);
            list.add(emp6);
            System.out.println("display the list before sorting");
            System.out.println(list);
            System.out.println("display the list after  salary sorting");
           Sorting salary=new Sorting();
           Collections.sort(list,salary);
            System.out.println(list);
            System.out.println("display the  list after lastname sorting");
           Getlastname lastname=new Getlastname();
           Collections.sort(list,lastname);
            System.out.println(list);
            System.out.println("Display the list after Firstname sortiong");
            Firstname f1=new Firstname();
            Collections.sort(list,f1);
            System.out.println(list);
        }
    }
