package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employeecomparable implements Comparable<Employeecomparable> {
    private String firstname;
    private String lastname;
    private int salary;

    public Employeecomparable(String firstname, String lastname, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;

    }

    public Employeecomparable() {
        super();
    }

    public String getLastname() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }


    public String getFirstname() {
        return firstname;
    }

    @Override
    public String toString() {
        return "Employeecomparable{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }

  /*  @Override
    public int compareTo(Employeecomparable o) {
        return this.lastname.compareTo(o.lastname);
    }*/

   /* @Override
    public int compareTo(Employeecomparable o) {
        return o.getLastname().compareTo(getLastname());
    }*/




    @Override
    public int compareTo(Employeecomparable o) {
        return this.getFirstname().compareTo(o.getFirstname()) ;
    }

   /* @Override
    public int compareTo(Employeecomparable o) {
        return this.getSalary() - o.getSalary();


    }*/
}

    class Employee1 {
        public static void main(String[] args) {

            List<Employeecomparable> list = new ArrayList<>();
            Employeecomparable ec1 = new Employeecomparable("Aditi", "Bhosale", 45000);
            Employeecomparable ec2 = new Employeecomparable("Bhagyashri", "Shinde", 55000);
            Employeecomparable ec3 = new Employeecomparable("Komal", "Ubale", 85000);
            Employeecomparable ec4 = new Employeecomparable("Dakshta", "Jadhav", 25000);
            Employeecomparable ec5 = new Employeecomparable("Sujata", "Panchal", 95000);
            list.add(ec1);
            list.add(ec2);
            list.add(ec3);
            list.add(ec4);
            list.add(ec5);

            System.out.println("dislay the list before sorting");
            System.out.println(list);
            System.out.println("display the list after sorting");
            Collections.sort(list);
            System.out.println(list);
        }
    }






