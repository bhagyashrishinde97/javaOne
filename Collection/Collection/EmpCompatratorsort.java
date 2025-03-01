package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpCompatratorsort {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public EmpCompatratorsort(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/

    public int getAge() {
        return age;
    }

  /*  public void setAge(int age) {
        this.age = age;
    }*/

    public double getSalary() {
        return salary;
    }

  /*  public void setSalary(double salary) {
        this.salary = salary;
    }*/

    @Override
    public String toString() {
        return "EmpCompatratorsort{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

// Comparator for sorting by name
class NameComparator implements Comparator<EmpCompatratorsort> {
    @Override
    public int compare(EmpCompatratorsort o1, EmpCompatratorsort o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

// Comparator for sorting by salary
class SalaryComparator implements Comparator<EmpCompatratorsort> {
    @Override
    public int compare(EmpCompatratorsort o1, EmpCompatratorsort o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
    }
}

class EmpComparator {
    public static void main(String[] args) {
        List<EmpCompatratorsort> list = new ArrayList<>();
        EmpCompatratorsort es1 = new EmpCompatratorsort("Aditi", 24, 35000);
        EmpCompatratorsort es2 = new EmpCompatratorsort("Bhagyashri", 24, 75000);
        EmpCompatratorsort es3 = new EmpCompatratorsort("Dakshta", 34, 85000);
        EmpCompatratorsort es4 = new EmpCompatratorsort("Shrvvani", 28, 95000);
        EmpCompatratorsort es5 = new EmpCompatratorsort("Shruti", 27, 65000);
        list.add(es1);
        list.add(es2);
        list.add(es3);
        list.add(es4);
        list.add(es5);
        System.out.println(list);
        System.out.println("Before sorting:");
        NameComparator firstNameComparator = new NameComparator();
        Collections.sort(list, firstNameComparator);

        System.out.println(""+list); //

       //
        //Collections.sort(list);  //
        SalaryComparator lastNameComparator = new SalaryComparator();
        Collections.sort(list, lastNameComparator);

        System.out.println("After  using Last Name sorting "+list); //
    }
}


