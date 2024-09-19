package Inheritance;

 interface ABC
{
   default void show()
   {
       System.out.println("Hi");
   }

}

interface XYZ
{
    default void show()

    {
        System.out.println("Hello");
    }

}

public class MultipleInheritance implements ABC, XYZ {

    public static void main(String[] args) {

        MultipleInheritance m = new MultipleInheritance();
        m.show();
    }

    @Override
    public void show() {
        ABC.super.show();
        XYZ.super.show();
    }
}

