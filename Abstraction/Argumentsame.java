package Abstraction;

public class Argumentsame {
    void display(String Name) {
        System.out.println("this is parent=" + Name);
    }
}
    class Argument extends Argumentsame
    {
        @Override
        void display(String Name)
        {
            System.out.println("this is child="+Name);
        }
        public static void main(String[] args) {
            Argumentsame a1=new Argumentsame();
            System.out.println("hello world");
            a1.display("sachin");
            Argumentsame a2=new Argument();
           // System.out.println("this is java");
           a2.display("ramesh");


        }
    }

