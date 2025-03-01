package Abstraction;

public interface Abcd {
    void method1();
    void method2();
    int a = 0;


}
class Cfgh implements Abcd {
    @Override
    public void method1() {
        System.out.println("this is interface method1");

    }

    @Override
    public void method2() {
        System.out.println("this is interface method2");

    }

    public static void main(String[] args) {
        Cfgh c=new Cfgh();
        c.method1();
        c.method2();
        System.out.println(10);


    }
}

