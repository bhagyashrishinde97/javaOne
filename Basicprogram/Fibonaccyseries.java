package Basicprogram;

public class Fibonaccyseries {
    public static void main(String[] args) {
        int n=10, firstterm=0, secondterm=1;
        System.out.println("display the fibonacy"+n+ "term");
        for(int i=1;i<=n; i++) {
            System.out.println(firstterm + ",");

            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
    }
}
//output//0,1,1,2,3,5,8.13,21,34 fibonaccy series