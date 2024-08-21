package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> Hashmap = new HashMap<>();
        Hashmap.put("java1", 10);
        Hashmap.put("jata2", 20);
        Hashmap.put("java3", 30);
        Hashmap.put("java4", 40);
        Hashmap.put("java5",50);
        System.out.println("Name="+Hashmap.get("java1"));
        System.out.println("Name="+Hashmap.get("jata2"));
        for (Map.Entry<String, Integer> entry : Hashmap.entrySet()) {
           // String key = entry.getKey();
          //  Integer value = entry.getValue();
            System.out.println("Object" + entry.getKey() + "Values:" + entry.getValue());



        }
        Hashmap.remove("java3");
        System.out.println(Hashmap);
    }
}