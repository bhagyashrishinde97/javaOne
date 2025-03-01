package Logicalclass;
//Write a Java Program to swap two numbers without using the third variable.
public class Swapwithoutthird {
    public static void main(String[] args) {
        int a=30;int b=50;
              a=a+b;
              b=a-b;
              a=a-b;
        System.out.println("after swaping  a=" +a+ "b=" +b);
    }
}
