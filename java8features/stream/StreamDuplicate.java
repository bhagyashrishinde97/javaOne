package java8features.stream;

import Basicprogram.UnicandDuplicate;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDuplicate {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(20, 30, 40, 60, 60, 14, 14, 70);
        // find unic element using set
        Set set = new HashSet<>(lists);
        lists.stream().filter(n -> !set.add(n)).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        // find unic element using list
        lists.stream().distinct().forEach(noduplicatedate -> System.out.println(noduplicatedate));
        System.out.println("_______________________________________________________--------");

        List<Integer> uniqueData = (List<Integer>) set.stream().collect(Collectors.toList());
        System.out.println(uniqueData);
        System.out.println("__________________________________________________-----------------");

        //List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        //find first element
        lists.stream().findFirst().ifPresent(System.out::println);
        System.out.println("__________________________________________________________________________");
        long count= lists.stream().count();
        System.out.println(count);
        System.out.println("______________________________________________________________---------------");
        // find maximum element
        int max=lists.stream().max(Integer::compare).get();
        System.out.println(max);
        //second way
        int maxData = lists.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Maximum Element (Alternative): " + maxData);
        System.out.println("_______________________________________________________________________");
        // display list in decending order
        lists.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        System.out.println("_______________________________________________________________________------");
        lists.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        System.out.println("____________________________________________________________________");

        //
             System.out.println("display local date=" +java.time.LocalDate.now());
             System.out.println("display local time=" +java.time.LocalTime.now());
             System.out.println("display local Datetime=" +java.time.LocalDateTime.now());
             System.out.println("_______________________________________________________________");

           //find display the square root
        lists.stream().map(i-> i*i*i).filter(i-> i>50).forEach(System.out::println);
        System.out.println("______________________________________________________________________");
        
















    }
}