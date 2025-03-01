package java8features.stream;


import java.util.Arrays;
import java.util.Comparator;

public class Food {
    public static void main(String[] args) {
        String[] StringArray = {"Banana", "Apple", "Orange", "Mango"};
        int Arraylength = StringArray.length;
        System.out.println("Arraylength;" + StringArray.length);
        Arrays.sort(StringArray);
        System.out.println("sorted Array" + Arrays.toString(StringArray));

        String min = Arrays.stream(StringArray).min(Comparator.naturalOrder()).orElse("No elements");
        String max = Arrays.stream(StringArray).max(Comparator.naturalOrder()).orElse("No elements");

        System.out.println("Minimum string: " + min);
        System.out.println("Maximum string: " + max);


        String[] sortedByLengthAsc = Arrays.stream(StringArray)
                .sorted(Comparator.comparing(String::length))
                .toArray(String[]::new);
        System.out.println("Sorted by increasing length:" + Arrays.toString(sortedByLengthAsc));

        String[] sortedByLengthDesc = Arrays.stream(StringArray)
                .sorted(Comparator.comparing(String::length).reversed())
                .toArray(String[]::new);
        System.out.println("Sorted by decreasing length" + Arrays.toString(sortedByLengthDesc));
    }
}


