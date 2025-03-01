package Static;

public class Staticmethod {
    static int a;//static variable

    static
    {
        System.out.println("this is static block");//this is static block
    }
    public Staticmethod()
    {
        System.out.println("this is constuctor");//this is constructor
    }
    public void show()
    {
        System.out.println("this is instance method");//this is instance method
    }
    static void  m1()
    {
        System.out.println("this is static method");//this is static method
    }
    public static void main(String[] args) {
        System.out.println("this is main method");
        Staticmethod.m1();
        System.out.println(Staticmethod.a=10);
        Staticmethod s1=new Staticmethod();
        s1.show();


    }
}
