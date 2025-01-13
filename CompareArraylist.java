package Collectionprogram;

import java.util.ArrayList;
import java.util.Objects;

public class CompareArraylist {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("rathod");
        list1.add("patil");
        list1.add("shinde");
        list1.add("shrirame");
        list1.add("jadhav");
        list1.add("kanthale");
        ArrayList<String> list2=new ArrayList<>();
        list2.add("rathod");
        list2.add("patil");
        list2.add("shinde");
        list2.add("shrirame");
        list2.add("jadhav");
        list2.add("kanthale");

        if(Objects.equals(list1,list2))
        {
            System.out.println("list is equals");
        }
        else {
            System.out.println("list is not equals");
        }
    }
    
}
