package Logicalclass;
//Write a Java Program to find whether a string or number is palindrome or not.

public class Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
            if (rev.equals(str)) {
                System.out.print("no is palindrome");
            } else {
                System.out.print("no is not palindrome");
            }
        }

    }


