package java8features;

import java.util.ArrayList;
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
            list.add(new Employee1(105, "Mohan", 22, "female", "Developer", 2017, 45000.00));
            list.add(new Employee1(106, "Rawat", 23, "male", "Developer", 2015, 35000.00));
            list.add(new Employee1(107, "Ajit", 23, "male", "Tester", 2015, 45000.00));
            list.add(new Employee1(108, "Sagar", 30, "female", "Backend Developer", 2013, 60000.00));
            list.add(new Employee1(109, "Satyam", 46, "female", "Front End Developer", 2013, 100000.00));
            System.out.println(list);
            // list out the name of employees in each department
            // what is total and average salary of organization
     //Double total_salary = list.stream().mapToDouble(a -> a.getSalary()).reduce(i -> i).getAsDouble();

// who is the oldest employee and its details
// List<Employee1> list1 = list.stream().max((a,b) -> a.getYearOfJoining().compareTo(b.getYearOfJoining())).collect(Collectors.toList());

        }
    }