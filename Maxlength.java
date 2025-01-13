package Collectionprogram;

import java.util.ArrayList;
import java.util.Collections;

public class Maxlength {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("rathod");
        list.add("patil");
        list.add("shinde");
        list.add("shrirame");
        list.add("jadhav");
        list.add("kanthale");
        System.out.println("String print berfore sorting"+list);
        String maxlength = Collections.max(list);
        System.out.println("display string after maxlength="+maxlength);
    }
}
