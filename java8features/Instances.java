package java8features;

@FunctionalInterface
public interface Instances {
    Student getStudent();
}

class Student {
    public void display() {
        System.out.println("this is Student method");
    }

    public static void main(String[] args) {
        // Use a lambda or method reference
        Instances instance = Student::new; // Constructor reference
        Student student = instance.getStudent();
        student.display();
    }
}
