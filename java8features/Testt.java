package java8features;

import java.sql.SQLOutput;

public class Testt implements LambdaTest{
    @Override
    public void display(int a,String b)
    {
        System.out.println("The value of a="+a);
        System.out.println("The value of b="+b);
    }

    public static void main(String[] args) {
        Testt tt=new Testt();
        tt.display(1000,"Tata");
    }
}
interface LambdaTest
{
    void display(int a, String b);
    static void show()
    {
        System.out.println("test");
    }
    public class SimpleLambdaExp
    {
        public static void main(String[] args) {
            Testt ss=new Testt();
            ss.display(100,"java");

            LambdaTest ref =(int aaa,String ggg)
            {
                System.out.println("the value of aaa="+aaa);
                System.out.println("the value of gg="+bbb);
            }
            ref.display(100,"JavaProgramming");




        }
    }


