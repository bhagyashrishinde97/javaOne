package Abstraction;
// abstract class extends another abstract class it is mandatory to child class provide method implementation in parent class
abstract class Abstractclass {
    abstract void test();
}
  abstract class Childs extends Abstractclass {
    @Override
      void test() {
          System.out.println("this is test method");

      }
  }
  /*  class Grandchild extends  Childs
    {

    }*/
    class Main1 extends Childs
    {



    public static void main(String[] args) {
       Main1 m1=new Main1();
       m1.test();


    }
}

