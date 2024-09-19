package java8features;

 interface A11 {
     default void test() {
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
    }
    public class DiamondProblem implements A11,B11
    {
        @Override
        public void test() {
        B11.super.test();
        A11.super.test();
    }

     @Override
     public void show()
     {

        }

        public static void main(String[] args) {
            DiamondProblem dd = new DiamondProblem();
            dd.test();
        }
    }




