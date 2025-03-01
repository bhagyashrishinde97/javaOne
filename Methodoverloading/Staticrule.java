package Methodoverloading;

import Static.Static;

public class Staticrule {
    public void display() {
        System.out.println("this is default parent class method");
    }

    static void print() {
        System.out.println("this is the parent static  print method ");
    }
}
    class Staticchild extends Staticrule
    {
        public void display()
        {
            System.out.println("this is child class default method");
        }
        static void print()
        {
            System.out.println("this is a static child class method");
        }

        public static void main(String[] args) {
              Staticrule sc1=new Staticrule();
              sc1.display();
              Staticrule.print();
              Staticrule sc2=new Staticchild();
              sc2.display();
              sc2.print();// this is the concept of the method hiding process
        }
    }

