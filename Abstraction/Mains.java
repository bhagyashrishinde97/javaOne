package Abstraction;

// Abstract class
abstract class Abstractrulefour {

    void display() {
        System.out.println("This is a method in the Abstractrulefour class.");
    }

    // Abstract method
    abstract void show();
}

// Non-abstract class extending the abstract class
class ConcreteClass extends Abstractrulefour {


    @Override
    void show() {
        System.out.println("this Abstractrule4 method");
    }
}

// Main class
public class Mains {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass(); // Instantiate ConcreteClass
        obj.display(); // Call the inherited method
        obj.show();    // Call the overridden method
    }
}
