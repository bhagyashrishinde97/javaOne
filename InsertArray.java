package Collectionprogram;

import java.util.ArrayList;
//3.WAP to insert element in String arraylist
public class InsertArray {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("rathod");
        list.add("patil");
        list.add("shinde");
        list.add("shrirame");
        list.add("jadhav");
        list.add("kanthale");
        System.out.println("display list before insert arraylist");
        System.out.println(list);
        System.out.println("display list after adding element");
        list.add(0,"patil");
        System.out.println(list);
        // WAP to remove the element in the given String
        list.remove(3);
        System.out.println("display the list before removing the element");
        System.out.println(list);

    }
}
