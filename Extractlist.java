package Collectionprogram;

import java.util.ArrayList;
//WAP to print extract element of an arraylist
public class Extractlist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(888);
        list.add(999);
        list.add(777);
        list.add(666);
        list.add(555);
        list.add(444);
        System.out.println(list);
        ArrayList<Integer> lists=new ArrayList<>(list);
        System.out.println(lists.subList(2,5));

    }
}
