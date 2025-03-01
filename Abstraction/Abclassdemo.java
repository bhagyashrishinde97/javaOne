package Abstraction;

abstract class Abclassdemo {
    abstract void show();

}


    class ABCD extends Abclassdemo {

         @Override
        public void show() {
            String name = "sachin";
            String address = "karvenager pune";
            float salaray = 2500.0f;
            System.out.println(name);
            System.out.println(address);
            System.out.println(salaray);

        }
    }

    class Xyz {


        public static void main(String[] args) {
           Abclassdemo a1=new ABCD() ;
           a1.show();
        }
       }

