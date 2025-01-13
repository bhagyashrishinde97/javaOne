package Collectionprogram.Hashset;

import java.util.HashSet;
import java.util.Objects;

public class Comparestring {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(40);
        numbers.add(80);
        numbers.add(100);
        numbers.add(70);
        numbers.add(80);
        numbers.add(89);
        HashSet<Integer> list=new HashSet<>();
        list.add(40);
        list.add(80);
        list.add(100);
        list.add(70);
        list.add(80);
        list.add(89);
        boolean ref= Objects.equals(numbers,list);
        if(ref)
        {
            System.out.println("is equal");
        }
        else {
            System.out.println("not equal");
        }

    }
}
