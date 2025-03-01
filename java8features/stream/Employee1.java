package java8features.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Employee1 {
    int id;
    String name;
    int age;
    String department;
    String gender;
    int yearOfJoining;
    double salary;

    Employee1(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{ Name:" + name + ",id:" + id + ",age:" + age + ",Gender:" + gender + ",Dep:" + department + ",Joining Date:" +
                yearOfJoining + ",Salary:" + salary + " }\n";
    }

    public static void main(String[] args) {
        ArrayList<Employee1> list = new ArrayList<>();
        list.add(new Employee1(101, "Sanjay", 26, "female", "Hr", 2017, 60000.00));
        list.add(new Employee1(102, "Vaibhav", 23, "male", "Team Lead", 1015, 55000.00));
        list.add(new Employee1(103, "Sanjay", 26, "male", "Team Lead", 2015, 55000.00));
        list.add(new Employee1(104, "Manoj", 29, "female", "Hr", 2013, 60000.00));
          list.add(new Employee1(105, "Mohini", 22, "female", "Developer", 2017, 45000.00));
         list.add(new Employee1(106, "Rawat", 23, "male", "Developer", 2015, 35000.00));
        list.add(new Employee1(107, "Ajit", 23, "male", "Tester", 2015, 45000.00));
        list.add(new Employee1(108, "Sagar", 30, "female", "Backend Developer", 2013, 60000.00));
        list.add(new Employee1(109, "Satyam", 46, "female", "Front End Developer", 2013, 100000.00));
        System.out.println(list);
         // display count employee
         long emplist1= list.stream().count();
         System.out.println();
       // dispaly all male employee

        long employee1List2=list.stream().filter(a-> a.getGender().equals("male")).count();
        System.out.println("display the how many male present="+employee1List2);

        // display all female employee
           long employee1list=list.stream().filter(a-> a.getGender().equals("female")).count();
           System.out.println(employee1list);

             //sum salary
         double emplist3=list.stream().mapToDouble(Employee1::getSalary).sum();
        System.out.println(emplist3);

        //min salary
           double emplist4=list.stream().mapToDouble(Employee1::getSalary).min().orElse(0.0);
           System.out.println(emplist4);

            // max salary
         double emplist5=list.stream().mapToDouble(Employee1::getSalary).max().orElse(0.0);
                System.out.println(emplist5);

                // display developer department salary

               List<Employee1> emplist7=list.stream().filter
                (employee1 -> "developer".equalsIgnoreCase(employee1.getDepartment()))
                .collect(Collectors.toList());
               System.out.println(emplist7);

              // display all employee name in team lead
                List<Employee1>list1=list.stream()
                .filter(employee ->"team lead".equalsIgnoreCase(employee.getDepartment()))
                .collect(Collectors.toList());
                 System.out.println(list1);

                  //department wise average salary
                 Map<String ,Double> avgsalaryeachdepartment=list.stream().collect
                (Collectors.groupingBy(Employee1::getDepartment,Collectors.averagingDouble
                        (Employee1::getSalary)));
                   System.out.println(avgsalaryeachdepartment);

                   //average age
                double lists=list.stream().mapToInt(Employee1::getAge).average().orElse(0.00);
                  System.out.println(lists);

    }
}