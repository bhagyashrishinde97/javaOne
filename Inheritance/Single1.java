package Inheritance;

public class Single1 {
    float salary=50000;

}
  class SingleExample1 extends Single1 {

      float bonus = 10000;


      public static void main(String[] args) {



      SingleExample1 s1 = new SingleExample1();

     System.out.println(" salary:"+s1.salary);
     System.out.println("bonus:"+s1.bonus);

  }
 }
