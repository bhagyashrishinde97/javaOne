package java8features.stream;

import java8features.Companyinfo;

import java.util.*;
import java.util.stream.Collectors;

public class Reduceoperation {
    int id;
    String name;
    int age;
    String department;
    double salary;

    public int getId() {
        return id;
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

    public double getSalary() {
        return salary;
    }

    public Reduceoperation(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Reduceoperation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


    public static void main(String[] args) {
        List<Reduceoperation> list = new ArrayList<>();
        list.add(new Reduceoperation(1, "Aditi", 24, "sales", 20000));
        list.add(new Reduceoperation(2, "Dakshta", 26, "It", 70000));

        list.add(new Reduceoperation(3, "Rajesh", 30, "Mechanical", 20000));

        list.add(new Reduceoperation(4, "Suraj", 27, "electrical", 20000));
        list.add(new Reduceoperation(5, "Shrikant", 29, "sales", 35000));

        list.add(new Reduceoperation(6, "Shreya", 24, "It", 90000));
        // count
        System.out.println("display list before sorting" + list);
        long count = list.stream().count();
        //minimum salary
        ;// Find the minimum salary


                Optional<Reduceoperation> lists = list.stream()
                 .min(Comparator.comparingDouble(Reduceoperation::getSalary));
                 System.out.println(lists);

                 //Find the maximum salary

                Optional<Reduceoperation> lists1=list.stream()
                   .max(Comparator.comparingDouble(Reduceoperation::getSalary));
                    System.out.println(lists1);

                    // sum of all salary
             double totalsalary=list.stream().mapToDouble(Reduceoperation::getSalary).sum();
             System.out.println(totalsalary);


             //display all It department employee

               List<Reduceoperation>list1=list.stream()
                       .filter(employee ->"It".equalsIgnoreCase(employee.getDepartment()))
                       .collect(Collectors.toList());
                       System.out.println();


                     // get all employee name
          List<String> list2=list.stream()
                .map(Reduceoperation::getName)
                .collect(Collectors.toList());
                System.out.println(list2);
                //

      Map<String ,Long> employeecount=list.stream().collect(Collectors.groupingBy(Reduceoperation::getDepartment,Collectors.counting()));
        System.out.println(employeecount);

              Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
                list.stream().collect(Collectors.groupingBy(Reduceoperation::getName, Collectors.averagingDouble(Reduceoperation::getSalary)));
              System.out.println(avgSalaryOfMaleAndFemaleEmployees);

        Map<String, Double> avgAgeOfEachDepartment =
                list.stream().collect(Collectors.groupingBy(Reduceoperation::getDepartment, Collectors.averagingInt(Reduceoperation::getAge)));
        System.out.println(avgAgeOfEachDepartment);

            //average salary of each department
               Map<String ,Double> avgsalaryeachdepartment=list.stream().collect
                (Collectors.groupingBy(Reduceoperation::getDepartment,Collectors.averagingDouble
                     (Reduceoperation::getSalary)));
                   System.out.println(avgsalaryeachdepartment);

    }
}










