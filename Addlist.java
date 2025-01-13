package Collectionprogram;
import Collectionprogram.Arraylist;

import java.util.ArrayList;

//WAP to java program to create an array list, add some colors (Strings) ans print out the result
public class Addlist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("pink");
        list.add("yellow");
        list.add("orange");
        list.add("blue");
        list.add("red");
        list.add("black");

        System.out.println("display the list="+list);

    }
}
