package Collectionprogram;

import java.util.ArrayList;
//WAP to join two arraylist
public class Join {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("rathod");
        list.add("patil");
        list.add("shinde");
        list.add("shrirame");
        list.add("jadhav");
        list.add("kanthale");
        ArrayList<String> lists=new ArrayList<>();
        lists.add("Darshan");
        lists.add("Datta");
        lists.add("Dolly");
        lists.add("Danvir");
        lists.add("Dipak");
        list.addAll(lists);
        System.out.println(list);

    }
}
