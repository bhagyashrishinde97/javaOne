package Basicprogram;

public class StaticMethodHidingExample {
    public static void main(String[] args) {
        // Accessing static method using the class name
        Parent.display(); // Calls Parent's static method
        Child1.display();  // Calls Child's static method

        // Accessing static method using a reference
        Parent obj = new Child1();
        obj.display();    // Calls Parent's static method (method hiding)
    }
}
