package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap= new HashMap<>();
        hashMap.put("java",100);
        hashMap.put("jcva",100);
       // System.out.println("hashMap"+hashMap);
        hashMap.put("jaba",100);
        hashMap.put("javat",100);
        hashMap.put("jada",100);
         Hashmap hashmap=new Hashmap();
         System.out.println(hashmap.hashCode());
        Hashmap hashmap1=new Hashmap();
        System.out.println(hashmap.hashCode());
        /*hashMap.put(null, 100);
        hashMap.put(null,120);
       System.out.println(" Before adding duplicate key "+hashMap.get(null));
        hashMap.put(null, 300); //When we enter duplicate key in HashMap, it will override the previous value.
       // hashMap.put(null, 90);
        System.out.println(" After adding duplicate key "+hashMap.get(null)); //90

        hashMap.put("Java", 888);
        Integer vv = hashMap.get("Java");
        System.out.println(vv);

       System.out.println(hashMap.size()); */





    }
}
