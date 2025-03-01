package Basicprogram;

public class Fibonaccy {
    public static void main(String[] args) {
        int n = 10, firstitem = 0, seconditem = 1;
        System.out.println("fibonaccy series" + n + "items");
        for (int i = 1; i <= n; i++) {
            System.out.println(firstitem + ",");

            int nextitem = firstitem + seconditem;
            firstitem = seconditem;
            seconditem = nextitem;
        }
    }
}
