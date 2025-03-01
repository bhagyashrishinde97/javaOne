package Polymorphism;

public class ABC {
    static int multiply(int a,int b)
    {
        return a*b;
}
    static int multiply(int a,int b,int c)
    {
        return a*b*c;
    }
    class CFG
    {
        public static void main(String[] args) {
            System.out.println(ABC.multiply(20,30));
            System.out.println(ABC.multiply(20,30,40));
        }
    }
}
