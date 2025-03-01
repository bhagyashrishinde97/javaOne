package Abstraction;

public class Statioverriding {
    static void display()
    {
        System.out.println("this is parent class static method");
    }
    class Employee extends Statioverriding
    {

       static void display()
       {
           System.out.println("this is Employee class method in java");
       }
    }
    public static void main(String[] args) {
        Statioverriding sc1=new Statioverriding();
        sc1.display();
      //  Employee ep1=new Employee();
       // ep1.display();

//Statioverriding sc2=new Employee();
 //   sc2.display();*/



    }
}
