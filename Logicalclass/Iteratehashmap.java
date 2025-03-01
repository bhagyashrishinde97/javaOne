package Logicalclass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iteratehashmap {
   public static void main(String[] args) {
      Map<String, Integer> hashmap = new HashMap<>();
      hashmap.put("suraj", 101);
      hashmap.put("shrikant", 102);
      hashmap.put("sujata", 103);
      hashmap.put("shridevi", 104);
      System.out.println("using for loop");
    Iterator<Map.Entry<String ,Integer>> map=hashmap.entrySet().iterator();
    while(map.hasNext())
    {
        Map.Entry<String,Integer> integerEntry=map.next();
        System.out.println("key:-" + integerEntry.getKey()+ ",value:-" +integerEntry.getValue());
    }
      System.out.println("using for each loop");
      for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
         System.out.println("key:-" + entry.getKey() + ",value:-" + entry.getValue());
      }
   }
}
