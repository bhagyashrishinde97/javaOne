package Methodoverloading;

public class Restrictiverule {



     void show() {
        System.out.println("this is parent class  public method");
    }
}
    class Restrictivechild extends Restrictiverule
    {

      public  void show()
        {
            System.out.println("this is Restrictiive child class method");

        }

        public static void main(String[] args) {
            Restrictiverule sc2=new Restrictiverule();
            sc2.show();
            Restrictivechild sc3=new Restrictivechild();
            sc3.show();
        }
    }

