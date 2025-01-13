package Collectionprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//1. write a program to print Arraylist String in alphabeticaly
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("rathod");
        list.add("patil");
        list.add("shinde");
        list.add("shrirame");
        list.add("jadhav");
        list.add("kanthale");
        System.out.println("list print before sorting"+list);
        Collections.sort(list);
        System.out.println("list print after sorting"+list);
        //using   stream api
        List<String> list1=list.stream().collect(Collectors.toList());
        System.out.println(list1);

    }
}
