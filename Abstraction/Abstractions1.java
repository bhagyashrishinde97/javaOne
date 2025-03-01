package Abstraction;


 abstract class Abstractions1 {
     abstract void  show();
   void test()
   {
       System.out.println("this is default method");
   }

   // static void show1() {
     //   System.out.println("this is static method");
    }
//}

class Student3 extends Abstractions1
    {
        @Override
        public void show()
        {
            System.out.println("this is abstract method");
        }
        public static void main(String[] args) {
            Student3 s1=new Student3();
            s1.test();
            //s1.show();
          //  Abstractions1.show1();

        }
    }




