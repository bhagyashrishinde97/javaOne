package Static;

import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        int a = 90;
        int b = 50;
        int c = 60;
        int d = 75;
        int e = 80;
        int avg = (a + b + c + d + e) / 5;
        System.out.println("avg = " + avg);

        if (avg > 90) {
            System.out.println("Merit");
        } else if (avg > 75 && avg <= 90) {
            System.out.println("First Class");
        } else if (avg > 60 && avg <= 75) {
            System.out.println("Second Class");
        } else if (avg > 35 && avg <= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}