package Basicprogram;

public class Mehtodoverloading {
    public int sum(int x,int y)
    {
        return  x +y;
    }
    public int sum(int x,int y,int z)
    {
        return x+y+z;
    }
    public double sum(double a,double b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Mehtodoverloading m1=new Mehtodoverloading();
        System.out.println( + m1.sum(10,20));
        System.out.println(+m1.sum(30,40,60));
        System.out.println(+m1.sum(20.10,35.20));
    }
}
