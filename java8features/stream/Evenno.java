package java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Evenno {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(30,33,43,50,60,70, 99,88);
        list.stream().filter( n -> n%2==0).forEach(System.out::println);
        //using map interface in java
  // Map<Boolean,List<Integer>> list2=list.stream().collect(Collectors.partitioningBy(num -> num %2==0));
  //   System.out.println(list2);
        int[] numms = {10, 15, 123, 45, 67, 19};
        List<String> list1 = Arrays.stream(numms)
                .boxed()
                .map(s -> s + "") // Convert integers to strings
                .filter(s -> s.startsWith("1")) // Corrected method name
                .collect(Collectors.toList());
                 System.out.println("Numbers starting with '1':");
                 System.out.println(list1);
    }











       // Map<Boolean, List<Integer>> partitionedMap = list.stream()
              //  .collect(Collectors.partitioningBy(num -> num % 2 == 0));
      //  System.out.println(partitionedMap);

    }

