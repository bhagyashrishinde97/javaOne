package Abstraction;
//
public class Overring {
   public void show() {
        System.out.println("this is parent class method");
    }
}
   class S1 extends Overring
   {
      // @Override
     public   void show()
        {
            System.out.println("this is child class method");
        }


       public static void main(String[] args) {
           Overring s1=new S1();
           Overring s2=new Overring();

           s1.show();
          s2.show();
       }
   }

