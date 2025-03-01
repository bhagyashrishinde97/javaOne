package Basicprogram;

public class Numberpalindrom {


    public static void main(String[] args) {
        int number = 9999;
        int Orignalno = number;
        
        int reverseno = 0;

        for (int temp = number; temp != 0; temp /= 10) {
            int digit = temp % 10; // Get the last digit
            reverseno = reverseno * 10 + digit;
        }
            if (Orignalno == reverseno) {
                System.out.println(Orignalno + "no is palindrome");
            }
             else
            {
                System.out.println(Orignalno + "no is not palindrome");
            }

        }
    }



