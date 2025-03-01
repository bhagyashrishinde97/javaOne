package java8features.stream;

import java.util.*;
import java.util.stream.Collectors;



public class Findlength {
        public static void main(String[] args) {


            List<String> sortedList = new ArrayList<>();

            sortedList.add("java");
            sortedList.add("python");
            sortedList.add("c++");
            sortedList.add("html");
            sortedList.add("css");
            sortedList.add("hibernate");
            sortedList.add("mySql");
            sortedList.add("javaScript");
            sortedList.add("tomcat");
            sortedList.add("machinelearning");
            sortedList.add("serviceregistry");
            sortedList.add("webclient");
            sortedList.add("feignclient");
            sortedList.add("microservice");
            sortedList.add("eurekaserver");
            sortedList.add("monolothic");
            sortedList.add("c");

            Collections.sort(sortedList);
            System.out.println(sortedList);
               //while using arraylist
            List<Integer> listsize = new ArrayList<>();
            for (String s : sortedList)
            {
                listsize.add(s.length());
        }
              System.out.println(listsize);

               //using Map
            Map<String ,Integer>mapsize=new LinkedHashMap<>();
            for(String s:sortedList)
                mapsize.put( s,(s.length()));
            System.out.println(mapsize);
            //using hashmap
            List<Integer> listsizes= sortedList.stream().map(String::length).collect(Collectors.toList());
            System.out.println(sortedList);
            System.out.println(listsizes);

        }
    }


