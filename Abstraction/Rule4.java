package Abstraction;

abstract class Rule4 {
    abstract void test();
}
abstract class Abst extends Rule4{
   // @Override
    void test() {
        System.out.println("this is parent class method");
          }
    }



