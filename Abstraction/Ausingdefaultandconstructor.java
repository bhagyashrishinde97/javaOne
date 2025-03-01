package Abstraction;

abstract class Ausingdefaultandconstructor {
//Ausingdefaultandconstructor() {
       // System.out.println("initialize the subject");
  //  }

    abstract void Subject();

    public void show() {
        System.out.println("This is subject class method");
    }
}
     class Allmethod extends Ausingdefaultandconstructor {

         @Override
       public   void Subject() {
             System.out.println("java,c++,c");
         }
     }
         class Abcdef
         {
             public static void main(String[] args) {
                 Allmethod a1=new Allmethod();
                 a1.Subject();
                 a1.show();
             }
         }




