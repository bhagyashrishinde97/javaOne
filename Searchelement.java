package Collectionprogram;

import java.util.ArrayList;
import java.util.Collections;

//WAP to search element of an arraylist
public class Searchelement {
    public static void main(String[] args) {
        ArrayList<String> lists=new ArrayList<>();
        lists.add("Darshan");
        lists.add("Datta");
        lists.add("Dolly");
        lists.add("Danvir");
        lists.add("Dipak");
        System.out.println("display the list before sorting="+lists);
        System.out.println(lists);
        System.out.println("display the list after sorting="+lists);
        Collections.sort(lists);
        System.out.println(lists);

        if(lists.contains(400))
        {
            System.out.println("display the search list="+lists.indexOf(400));
        }
        else {
            System.out.println("not present inside the list");
        }
    }
}
