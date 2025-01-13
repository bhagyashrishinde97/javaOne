package Collectionprogram;

import java.util.ArrayList;
import java.util.Collections;
//WAP to replace the 3 position element in the arraylist
public class Replace {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(22);
        list.add(44);
        list.add(77);
        list.add(88);
        list.add(999);

        System.out.println(list);
    Collections.swap(list,3 ,list.size()-1);
    System.out.println(list);
        ArrayList<Integer>  lists=new ArrayList<>(list);
        System.out.println(lists.subList(2,5));
        System.out.println(list);

    }
}
