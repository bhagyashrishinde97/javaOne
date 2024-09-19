package javaprogram;

public class Patternprog {

    public static void main(String[] args) {
        // Loop for each row
        for (int i = 1; i <= 5; i++) {
            // Loop to print spaces
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }

            // Loop to print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

}
