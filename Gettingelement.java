package Collectionprogram;

import java.util.ArrayList;
import java.util.HashSet;
//  WAP to get the no of elements in a hashset
public class Gettingelement {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(40);
        numbers.add(80);
        numbers.add(100);
        numbers.add(70);
        numbers.add(80);
        numbers.add(89);
        int index=3;
        ArrayList<Integer> list=new ArrayList<>(numbers);
       // for(int i=0;i< list.size();i++)
       // {
          //  if(i== index);
           // System.out.println(list.get(i));
        if(index>=0 && index < list.size())
        {
            System.out.println("get the element" +list.get(index));
        }
        else {
            System.out.println("get out of bound");
        }

    }
}
