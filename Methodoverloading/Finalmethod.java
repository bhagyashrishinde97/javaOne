package Methodoverloading;
//  final method does not suppert method overriding
public class Finalmethod {
    final void display() {
        System.out.println("this is final method in parent class");
    }




}

    class Cfg extends Finalmethod
    {
      /* @Override
         void display() {
            System.out.println("this is final child class method"); */

        public static void main(String[] args) {
            Finalmethod f1=new Finalmethod();
            f1.display();

        }
    }

