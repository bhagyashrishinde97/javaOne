package Abstraction;

// Parent class
public class ABCDe {
    public void m1() {  // Made public
        System.out.println("This is m1 method from ABCDe (Parent Class)");
    }
}

// Child class extending ABCDe
class XYZ extends ABCDe {

    public void m1() {  // Must also be public
        System.out.println("This is m1 method from ABCDe (Parent Class)");
    }

    public static void main(String[] args) {

       // XYZ x1 = new XYZ();
       // x1.m1();  // Calls overridden method in XYZ
    }
}
