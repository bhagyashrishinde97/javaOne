package Collectionprogram.Hashmap;

import Collection.Hashmap;
//WAP to associate the specified value with the specified key in hashmap
import java.util.HashMap;

public class Specifiedkayvalue {
    public static void main(String[] args) {
        HashMap<Integer,String> hashset=new HashMap();
        hashset.put(1,"sachin");
        hashset.put(2,"shrikant");
        hashset.put(3,"suraj");
        hashset.put(4,"suyash");
        hashset.put(5,"rajvir");
        //count the no of element present in hashmap
        System.out.println("dispaly the no of count="+hashset.size());
        if(hashset.containsKey("suraj"))
        {
            System.out.println("value is present ");
        }
        else {
            System.out.println("not present");
        }
    }
}
