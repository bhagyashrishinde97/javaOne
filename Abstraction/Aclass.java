package Abstraction;

abstract class Aclass {
    abstract  void method1();
}
abstract class Bclass extends Aclass
{
    abstract void method2();
}

class Cclass extends Bclass {


    @Override
    void method1() {
        System.out.println("This is parent class method");
    }

    @Override
    void method2() {
        System.out.println("this is child class method");
    }
}

    class main {
        public static void main(String[] args) {
            Cclass c1 = new Cclass();
            c1.method1();
            c1.method2();
        }
    }
