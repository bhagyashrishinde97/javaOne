package Abstraction;

abstract class Abstractsclass {
    abstract void show();

    void test() {
        System.out.println("this is default method");
    }
}
  class Diraj extends Abstractsclass
  {


      @Override
      void show() {
          System.out.println("this is abstract method");

      }
      public static void main(String[] args) {
         Abstractsclass s1=new Diraj();
            s1.show();
       s1.test();


      }
  }



