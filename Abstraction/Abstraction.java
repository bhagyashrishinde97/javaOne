package Abstraction;

abstract class Rule5 {
    abstract void show();
}
    public class Abstraction extends Rule5
    {
        @Override
        void show() {
            System.out.println("Implementing  parent class abstract  method " +"in non abstract child class");
        }

        public static void main(String[] args) {
            Abstraction a1=new Abstraction();
            a1.show();
        }


}
