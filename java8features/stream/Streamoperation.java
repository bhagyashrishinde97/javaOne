package java8features.stream;

import Inheritance.Single1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamoperation {
    public static void main(String[] args) {
        List<String> lists=new ArrayList<>();
        lists.add("pratiksha");
        lists.add("prajakta");
        lists.add("pranali");
        lists.add("Ashitosh");
        lists.add("Ashlesha");
        lists.add("Aditi");
        lists.add("Aditya");
        lists.add("Anuragh");
        lists.add("pratiksha");
        lists.add("Anuradha");
        //distinct element
        List<String> stringList=lists.stream().distinct().collect(Collectors.toList());
          System.out.println(stringList);

        //name length >5

        stringList.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

        stringList.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

        //traversable stream only one

            Stream<String>stream=stringList.stream();
              stream.forEach(System.out::println);
              // stream.forEach(System.out::println);
        //empty String

        Stream<String>list=Stream.empty();
        System.out.println(list.count());

        //single element

          Stream<Streamoperation> list1=Stream.of(new Streamoperation());
          System.out.println(list1.count());
           //limit 5

              List<String> list2=lists.stream().limit(5).collect(Collectors.toList());
              System.out.println(list2);
               // map list

            lists.stream().map(String::length).forEach(System.out::println);

            // sorted natural order

             List<String> list3=lists.stream().sorted().collect(Collectors.toList());
              System.out.println(list3);

            //sorted according to their own needs

              List<String>  list4=    lists.stream().sorted((String name1,String name2)->
                  name1.length()- name2.length()).collect(Collectors.toList());
                    System.out.println(list4);








    }


}
