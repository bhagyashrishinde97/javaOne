package java8features;

 interface A11 {
     default void display() {
         System.out.println("this is method in interface A11");
     }
 }
    interface B11
    {
        default void test()
        {
            System.out.println("this is method  in interface B11 ");
        }
        void show();
        static void m1()
        {
            System.out.println("this is static method");
        }
    }
    public class DiamondProblem implements A11,B11
    {
       // @Override
        public void test() {
        B11.super.test();
        A11.super.display();
    }

     @Override
     public void show()
     {
         System.out.println("this is abstract show methods ");
        }

        public static void main(String[] args) {
            DiamondProblem dd = new DiamondProblem();
            dd.test();
            dd.show();
            B11.m1();
        }
    }




