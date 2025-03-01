package java8features;

public interface ABCD {
   default void show()
    {
        System.out.println("this abcd class method");
    }
     public interface XYZ {
         default void display() {
             System.out.println("this is XYZ class method");
         }

          void test();
      }
        class Diamondprogramjava8 implements ABCD ,XYZ
             {

                 public void show()
                 {
                 ABCD.super.show();
                 XYZ.super.display();

             }
             @Override
             public void test() {

             }

         public static void main(String[] args) {
             Diamondprogramjava8 p1=new Diamondprogramjava8();
             p1.show();
         }
             }
         }


