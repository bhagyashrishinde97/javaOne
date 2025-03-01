package Basicprogram;

public class Parent2 {
    static void show() {
        System.out.println("this is Staticparent method");
    }
}
    class Child2 extends Parent2
    {
        static void show()
        {
            System.out.println("this is Staticchild class method");
        }

        public static void main(String[] args) {
            Parent2.show();
            Child2.show();
           Parent2 s1=new Child2 ();
            s1.show();
        }
    }

