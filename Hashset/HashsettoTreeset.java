package Collectionprogram.Hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashsettoTreeset {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(40);
        numbers.add(80);
        numbers.add(100);
        numbers.add(70);
        numbers.add(80);
        numbers.add(89);
        TreeSet<Integer> list=new TreeSet<>(numbers);
        System.out.println(list);
    }
}
