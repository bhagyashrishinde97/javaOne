package Inheritance;

public class Parent1 {
    int age=34;
    String name="java Programming";
    void MethodofParent1()
    {
        System.out.println("This is  create method");
    }
    void test()
    {
        System.out.println("This is test method");
    }
}
class Child1 extends Parent1
{
    public static void main(String[] args) {
        Child1 child=new Child1();
        child.MethodofParent1();
    }
}
class InheritanceIntro extends Parent1
{
    public static void main(String[] args) {
        InheritanceIntro In=new InheritanceIntro();
        In.test();
        System.out.println("age" +In.age);
    }
}
