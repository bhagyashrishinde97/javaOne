package Inheritance;

public class
SingleParent {
    void SingleParentMethod()

    {
        System.out.println("This method in parent class");
    }
}
 class SingleExample extends SingleParent
{
    public static void main(String[] args) {
        SingleExample s1=new SingleExample();
        s1.SingleParentMethod();
    }
}
