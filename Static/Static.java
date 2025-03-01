package Static;

public class Static {

        int empId;            // Instance variable
        String empName;       // Instance variable
        static String company = "TechCorp";  // Static variable

        // Constructor to initialize instance variables
        public Static(int empId, String empName) {
            this.empId = empId;
            this.empName = empName;
        }

        // Method to display employee details
        public void display() {
            System.out.println(empId + " " + empName + " " + company);
        }

        public static void main(String[] args) {
            // Creating objects of Employee class
            Static e1 = new Static(101, "Alice");
            Static e2 = new Static(102, "Bob");

            // Displaying details of employees
            e1.display();
            e2.display();

            // Modifying static variable
            Static.company = "NextGen Solutions";

            // Displaying details after changing the static variable
            e1.display();
            e2.display();
        }
    }
