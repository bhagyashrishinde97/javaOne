package Abstraction;

public class test extends Test1 {
    void method() {
        System.out.println("This is normal method");


    }

    @Override
    void method2() {
        System.out.println("This is abstract class method");
    }

    @Override
    void method3() {
        System.out.println("this is abstract class second method");

    }

    public static void main(String[] args) {
        System.out.println("this is java main method");
        test t1 = new test();
        t1.method2();
        t1.method3();
        t1.method();
    }
}


