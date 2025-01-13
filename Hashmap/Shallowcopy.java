package Collectionprogram.Hashmap;

import java.util.HashMap;

public class Shallowcopy {
    public static void main(String[] args) {
        HashMap<Integer, String> hashset = new HashMap();
        hashset.put(1, "sachin");
        hashset.put(2, "shrikant");
        hashset.put(3, "suraj");
        hashset.put(4, "suyash");
        HashMap<Integer, String> map = new HashMap<>(hashset);
        System.out.println(hashset);
        System.out.println(map);
    }
}