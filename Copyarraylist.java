package Collectionprogram;

import java.util.ArrayList;
import java.util.Collections;

//WAP to an copy of element in arraylist
public class Copyarraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("rathod");
        list.add("patil");
        list.add("shinde");
        list.add("shrirame");
        list.add("jadhav");
        list.add("kanthale");
       System.out.println("display list before insert arraylist"+list);
         ArrayList<String> lists=new ArrayList<>(list);
       System.out.println(lists);
        //WAP to shufle of an arraylist
        System.out.println("display the list before shuffle");
        System.out.println(list);
        System.out.println("display the list after shuffle");
        Collections.shuffle(list);
        System.out.println(list);
        //

    }
}
