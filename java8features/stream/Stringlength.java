package java8features.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stringlength {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("orange");
        fruit.add("mango");
        fruit.add("mango");
        fruit.add("mango");
        // find maximum element
        int maxlength=fruit.stream().mapToInt(String::length).max().orElse(0);
        List<String> list=fruit.stream
                ().filter(a-> a.length()==maxlength)
                .collect(Collectors.toList());
        System.out.println(list);

      }
}








