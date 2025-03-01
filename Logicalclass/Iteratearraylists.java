package Logicalclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
public class Iteratearraylists {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add("samir");
        list.add("sanjana");
        list.add("Shrikant");
        System.out.println(list.size());
        //list iterate using  while loop
          Iterator itr= list.iterator();
          while(itr.hasNext())
         {
            System.out.println(itr.next());
         }
        System.out.println("using  advance for-loop");

        //list iterate using advance for-loop
        for(Object obj:list)
        {
            System.out.println(obj);
        }

        System.out.println("using for loop");
           // using for loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

    }
}
