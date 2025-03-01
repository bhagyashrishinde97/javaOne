package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Intermediatemethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("sachin");
        names.add("suraj");
        names.add("swapni");
        names.add("shrikant");
        names.add("shridhar");
        names.add("Swaraj");
        names.add("Shri");
        names.add("Sham");
        names.add("sidhant");
        System.out.println(names);
        //List<String> stringList= names.stream().distinct().collect(Collectors.toList());
        List<String> stringList = names.stream().distinct().collect(Collectors.toList());

        // Print the distinct list
        System.out.println("Distinct List: " + stringList);
    }
}