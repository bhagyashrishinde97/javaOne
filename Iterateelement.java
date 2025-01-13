package Collectionprogram;

import java.util.ArrayList;
import java.util.Iterator;


//2. WAP to iterate the all element by the given element
public class Iterateelement {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("pink");
        list.add("yellow");
        list.add("orange");
        list.add("blue");
        list.add("red");
        list.add("black");
        for(String lists:list)
        {
            System.out.println(list);
        }
        Iterator<String> lists = list.iterator();
                while(lists.hasNext())
                {
                    System.out.println(lists.next());
                }

    }
}
