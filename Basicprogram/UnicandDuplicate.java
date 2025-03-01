package Basicprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnicandDuplicate {

        public static void main(String[] args) {
            // Declare two arrays
            Integer[] array1 = {1, 2, 3, 4, 5, 6};
            Integer[] array2 = {4, 5, 6, 7, 8, 9};

            // Combine the arrays into one list
            List<Integer> combinedList = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                    .collect(Collectors.toList());

            // Find duplicate elements
            List<Integer> duplicates = combinedList.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() > 1) // Keep only elements that appear more than once
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());


            //

            // Find unique elements
            List<Integer> uniqueElements = combinedList.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() == 1) // Keep only elements that appear once
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());


            System.out.println("Duplicate elements: " + duplicates);
            System.out.println("Unique elements: " + uniqueElements);
        }
    }

