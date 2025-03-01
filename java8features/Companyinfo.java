package java8features;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

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
        list.add(new Companyinfo("Aditi", 24, "female", 80000, 2023, "It"));
        list.add(new Companyinfo("Akshay", 23, "male", 70000, 2010, "Sales"));
        list.add(new Companyinfo("Abhijit", 27, "male", 90000, 2012, "Marketing"));
        list.add(new Companyinfo("Adhiraj", 30, "male", 110000, 2013, "It"));
        list.add(new Companyinfo("Akansha", 23, "female", 60000, 2024, "Mechanical"));
        list.add(new Companyinfo("Shrdha", 27, "female", 80000, 2023, "Sales"));
        list.add(new Companyinfo("sujata", 22, "female", 50000, 2024, "It"));
        list.add(new Companyinfo("Supriya", 28, "female", 100000, 2024, "Accountent"));
        System.out.println("display list before sorting" + list);
        // Long count = list.stream().count();
        // System.out.println("Count of Total employees = " + count);

        //How many male and female employees are there in the organization?
        //using method reference
        System.out.println("________________________________________________________________________________________________________");
        Map<String, Long> emplist = list.stream().collect(Collectors.groupingBy(Companyinfo::getGender, Collectors.counting()));
        System.out.println(emplist);
        System.out.println("_________________________________________________________________________________________________");
        // print the how many male employee
        long male_emp = list.stream().filter(employee -> "Male".equalsIgnoreCase(employee.getGender())) // Safe null check
                .count();
        System.out.println("male_emp" + male_emp);
        System.out.println("________________________________________________________________________________________________________");
        //print how many female employee
        long female_emp = list.stream().filter(employee -> "Female".equalsIgnoreCase(employee.getGender())) // Safe null check
                .count();
        System.out.println("female_emp" + female_emp);
        System.out.println("_____________________________________________________________________________________________________________________");
        //  Print the name of all departments in the organization?
        list.stream().map(Companyinfo::getDepartment).distinct().forEach(System.out::println);
        System.out.println("_______________________________________________________________________-");
        // print the name of all employee in the organization
        list.stream().map(Companyinfo::getName).distinct().forEach(System.out::println);
        System.out.println("_____________________________________________________________________________________________________________________");
        //  What is the average age of male and female employees?
        Map<String, Double> emplist1 = list.stream().collect(Collectors.groupingBy(Companyinfo::getGender, Collectors.averagingInt(Companyinfo::getAge)));
        System.out.println(emplist1);
        System.out.println("_____________________________________________________________________________________________________");
        //get the highest paid emoloyee of the organization
        Optional<Companyinfo> emplist2 = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Companyinfo::getSalary)));
        emplist2.get();
        System.out.println(emplist2);
        System.out.println("__________________________________________________________________________________________________________________-");
        //Get the names of all employees who have joined after 2015?
        list.stream().filter(a -> a.getJoiningyear() > 2015).map(Companyinfo::getName).forEach(System.out::println);
        System.out.println("________________________________________________________________________________________________________________");

        //count the number of employee in each department
        Map<String, Long> emplist3 = list.stream().collect(Collectors.groupingBy(Companyinfo::getDepartment, Collectors.counting()));
        System.out.println("number of employee in each department" + emplist3);
        System.out.println("____________________________________________________________________________________________________________________");
//count the number of  averaging salary of each department
        Map<String, Double> emplist4 = list.stream().collect(Collectors.groupingBy(Companyinfo::getDepartment, Collectors.averagingDouble(Companyinfo::getSalary)));
        System.out.println(emplist4);
        System.out.println("________________________________________________________________________________________________________________________");

        //
        System.out.println("__________________________________________________________________________________________-");
        //Who has the most working experience in the organization?
        Optional<Companyinfo> emplist9 = list.stream().sorted(Comparator.comparingInt(Companyinfo::getJoiningyear)).findFirst();
        emplist9.get();
        System.out.println(emplist9);
        System.out.println("_______________________________________________________________________________________________________________");
        // how many employee in sales and marketing organization
        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing =
                list.stream()
                        .filter(e -> e.getDepartment() == "It & solutions")
                        .collect(Collectors.groupingBy(Companyinfo::getGender, Collectors.counting()));

        System.out.println(countMaleFemaleEmployeesInSalesMarketing);

        // System.out.println(emplist10);
        System.out.println("__________________________________________________________________________________________________");
        //What is
        // the average salary of male and female employees
        Map<String, Double> emplist11 = list.stream().collect(Collectors.groupingBy
                (Companyinfo::getGender, Collectors.averagingDouble(Companyinfo::getSalary)));
        System.out.println(emplist11);


        //list down the names of all employees in each department
        Map<String, List<String>> emplist14 = list.stream()
                .collect(Collectors.groupingBy(
                        Companyinfo::getDepartment,
                        Collectors.mapping(Companyinfo::getName, Collectors.toList())
                ));
        System.out.println(emplist14);
        //What is the average salary and total salary of the whole organization?
        Map<String, Double> emplist15 = list.stream().collect(Collectors.groupingBy
                (Companyinfo::getDepartment, Collectors.averagingDouble(Companyinfo::getSalary)));
        System.out.println(emplist4);
        /*double totalSalary = list.stream()
                .mapToDouble(Companyinfo::getSalary)
                .sum();
        System.out.println("Total Salary of the Organization: " + totalSalary);
        System.out.println("______________________________________________________________________________________________________--");
       // Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Companyinfo>> partitionEmployeesByAge = list.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        System.out.println("Employees older than 25 years: " + partitionEmployeesByAge.get(true));
        System.out.println("Employees 25 years or younger: " + partitionEmployeesByAge.get(false));
        System.out.println("___________________________________________________________________________________________________");*/
        double totalSalary = list.stream()
                .mapToDouble(Companyinfo::getSalary)
                .sum();
        System.out.println("Total Salary of the Organization: " + totalSalary);
        System.out.println("______________________________________________________________________________________________________");

// Separate employees by age
        Map<Boolean, List<Companyinfo>> partitionEmployeesByAge = list.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        System.out.println("Employees older than 25 years: " + partitionEmployeesByAge.get(true));
        System.out.println("Employees 25 years or younger: " + partitionEmployeesByAge.get(false));
        System.out.println("___________________________________________________________________________________________________");
       // Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Companyinfo> oldestEmployeeWrapper =list.stream().max(Comparator.comparingInt(Companyinfo::getAge));
        oldestEmployeeWrapper.get();
        System.out.println(oldestEmployeeWrapper);

    }
}


