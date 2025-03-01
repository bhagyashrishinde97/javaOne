package Methodoverloading;

public class Restrictiveprotected {
     void display()
    {
        System.out.println("this is protected parent method");
    }

}
class Child3 extends Restrictiveprotected
{
    protected void display()
    {
        System.out.println("This is  public child class method ");
    }

    public static void main(String[] args) {
       Child3 ch2=new Child3();
       ch2.display();
        Restrictiverule sc2=new Restrictiverule();
        sc2.show();

    }
}
