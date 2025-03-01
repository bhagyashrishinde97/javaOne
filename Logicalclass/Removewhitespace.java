package Logicalclass;
//Write a Java Program to remove all white spaces from a string with using replace().

public class Removewhitespace {
    public static void main(String[] args) {
        String str = "java is programming language";
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);
    }
}

