package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort implements Comparable<EmployeeSort> {
    String FirstName;
    String LastName;
    int Salary;

    public EmployeeSort() {
    }

   public int getSalary() {
       return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }


    public EmployeeSort(String FirstName, String LastName, int Salary) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Salary = Salary;

    }

    @Override
    public String toString() {
        return "EmployeeSort{" +
                "firstName='" + FirstName + '\'' +
                ", lastName='" + LastName + '\'' +
                ", salary=" + Salary +
                '}';

    }
    /* public int getSalary() {
     return Salary;
    }

     public void setSalary(int Salary) {
     this.Salary = Salary;
      }*/
  public String getFirstName() {
       return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    @Override
    public int compareTo(EmployeeSort o) {
        return this.getLastName().compareTo(o.getLastName());
    }
}

    class Sorting {
        public static void main(String[] args) {

           // String[] string = {"Aditi", "Bhagyashri", "Dakshta", "Komal", "Anjali", "Rupali", "Kalyani"};

           EmployeeSort obj1=new EmployeeSort("Aditi", "Bhosale" ,25000);
           EmployeeSort obj2=new EmployeeSort("Bhagyashri","Shinde",60000);
          EmployeeSort obj3= new EmployeeSort("Dakshta","Jadhav",70000);
          EmployeeSort obj4= new EmployeeSort("komal","Ubale",35000);
         EmployeeSort  obj5=  new EmployeeSort("Anjali","Patil",60000);
          EmployeeSort obj6=  new EmployeeSort("Rupali","Kothare",50000);
           EmployeeSort obj7= new EmployeeSort("Kalyani","Rathod",40000);
            List<EmployeeSort> list = new ArrayList<>();


           // list.add(obj1);
            //list.add(obj2);
           // list.add(obj3);
           list.add(obj4);
           list.add(obj5);
            list.add(obj6);
           // list.add(obj7);

            System.out.println("print list before sorting");
            System.out.println(list);


            System.out.println("print list after sorting");
            Collections.sort(list);
            System.out.println(list);

        }
    }






