package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("java", 10);
        hashmap.put("java", 20);
        hashmap.put("java", 30);
        hashmap.put("java", 40);
        hashmap.put("javat", 50);
        System.out.println("Name=" + hashmap.get("java"));
        System.out.println("name=" + hashmap.get("javat"));
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("object=" + entry.getKey() + "values=" + entry.getValue());
            //hashmap.remove("javat");

            //System.out.println(hashmap);
        }
    }

}