package java8features.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Companyinfo {

    String name;
    int age;
    String gender;
    double salary;
    int joiningyear;
    String Department;

    public Companyinfo(String name, int age, String gender, double salary, int joiningyear, String Department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.joiningyear = joiningyear;
        this.Department = Department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public int getJoiningyear() {
        return joiningyear;
    }

    public String getDepartment() {
        return Department;
    }


    @Override
    public String toString() {
        return "Companyinfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", joiningyear=" + joiningyear +
                ", Department='" + Department + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Companyinfo> list = new ArrayList<>();
        list.add(new Companyinfo("Aditi", 24, "female", 80000, 2023, "it"));
        list.add(new Companyinfo("Akshay", 23, "male", 70000, 2020, "Sales"));
        list.add(new Companyinfo("Abhijit", 27, "male", 90000, 2020, "Marketing"));
        list.add(new Companyinfo("Adhiraj", 30, "male", 110000, 2018, "It"));
        list.add(new Companyinfo("Akansha", 23, "female", 60000, 2024, "Mechanical"));
        list.add(new Companyinfo("Shrdha", 27, "female", 80000, 2023, "Sales"));
        list.add(new Companyinfo("sujata", 22, "female", 50000, 2024, "It"));
        list.add(new Companyinfo("Supriya", 28, "female", 100000, 2024, "Accountent"));
        System.out.println("display list before sorting" + list);
        long emplist = list.stream().count();
        System.out.println(emplist);
      long emplist1=list.stream().filter(a -> a.getGender().equals("male")).count();
        System.out.println("display the how many male employee"+emplist);

        long emplist2=list.stream().filter(a -> a.getGender().equals("female")).count();
        System.out.println("how many female employee present="+emplist2);


    }
}




//}