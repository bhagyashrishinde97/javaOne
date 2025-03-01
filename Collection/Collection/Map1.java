package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("java", 100);
        hashmap.put("java", 100);
        hashmap.put("java", 100);
        hashmap.put("java", 120);
        System.out.println("display="+hashmap);

        Map hashmap1=new HashMap<>();
        System.out.println(hashmap.hashCode());
        Map hashmap2=new HashMap<>();
        System.out.println(hashmap.hashCode());
        hashmap.put(null,100);
        hashmap.put(null,100);
        System.out.println("before adding duplicate keys ="+hashmap.get(null));
        hashmap.put(null,39);
        hashmap.put(null,99);
        System.out.println("after adding duplicate keys ="+hashmap.get(null));
        hashmap.put("Java", 888);
        Integer vv = hashmap.get("Java");
        System.out.println(vv);

        System.out.println(hashmap.size());
    }
}