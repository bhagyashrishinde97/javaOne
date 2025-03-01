package Basicprogram;

public class MethodOverriding {
   final  void sleep() {
        System.out.println("this is final method in super class");
    }
}
    class Child extends MethodOverriding
    {
           //@Override
        //sleep
        public void Childsleep()
        {
            System.out.println("this is child class sleep method");
        }
        public static void main(String[] args)
        {
           Child obj=new Child();
           obj.sleep();
           obj.Childsleep();
        }
    }



