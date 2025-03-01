package Abstraction;

 interface  Abc {
   default void show() {
   System.out.println("This is abc class method");
  }
 }
     interface xyz {
      default void show() {
       System.out.println("this is xyz class method");
      }
     }
      public class Student implements Abc, xyz {

       public static void main(String[] args) {
        Student s1 = new Student();

               s1.show();
       }
        @Override
        public void show () {
         Abc.super.show();
         xyz.super.show();
        }
       }



