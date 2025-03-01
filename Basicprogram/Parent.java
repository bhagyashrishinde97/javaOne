package Basicprogram;

public class Parent {
    // Static method in the parent class
    static void display() {
        System.out.println("Static method in Parent class.");
    }
}

class Child1 extends Parent {
    // Static method in the child class (method hiding)
    static void display() {
        System.out.println("Static method in Child class.");
    }
}



