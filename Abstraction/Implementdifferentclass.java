package Abstraction;

abstract class Implementdifferentclass {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
 abstract class Parent2 extends Implementdifferentclass {

    @Override
    void m1() {


        System.out.println("this is the Parent2 class method");
    }
}
 abstract class Child2 extends Parent2 {
    @Override
    void m2() {
        System.out.println("This is the Child2 class method");
    }
}

class Grandchild extends Child2 {
    @Override
    void m3() {
        System.out.println("This is Grandchild class method");
    }
}
    class Abcde
    {
        public static void main(String[] args) {
            Grandchild g1=new Grandchild();
            g1.m1();
            g1.m2();
            g1.m3();
        }
    }




