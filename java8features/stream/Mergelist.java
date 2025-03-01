package java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mergelist {
    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(10,20,30,60,40,50);
        List<Integer> list2=Arrays.asList(50,60,70,80,90);
        List<Integer> interlist=list1.stream().filter(list2::contains).collect(Collectors.toList());
         System.out.println(interlist);

        //List<Integer>list3=list1.stream().distinct().collect(Collectors.toList());
       // System.out.println(list3);


    }
}
