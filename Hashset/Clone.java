package Collectionprogram.Hashset;

import java.util.HashSet;
//WAP to clone the element of the arraylist
public class Clone {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(40);
        numbers.add(80);
        numbers.add(100);
        numbers.add(70);
        numbers.add(80);
        numbers.add(89);
        HashSet<Integer> colors= (HashSet<Integer>) numbers.clone();
        System.out.println("orignal list");
        System.out.println(numbers);
        System.out.println(" cloned list");
        System.out.println(colors);

    }
}
