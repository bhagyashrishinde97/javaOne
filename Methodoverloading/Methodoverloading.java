package Methodoverloading;

import Basicprogram.Mehtodoverloading;

public class Methodoverloading {

    public int show(int a,int b)
    {
        return a+b;
    }
    public int show(int a,int b,int c)
    {
        return a+b+c;
    }
    public double show(double a,double b)
    {
        return a+b;
    }


    public static void main(String[] args) {
        Mehtodoverloading mc2=new Mehtodoverloading();
        System.out.println(+mc2.sum(30 ,50));
        System.out.println(+mc2.sum(60,70,90));
        System.out.println(+mc2.sum(88.5,99.9));
    }
}
