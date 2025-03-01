package Collection;

import java.util.HashMap;
import java.util.Map;

public class hashMap1 {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("java",100);
        hashMap.put("java",100);
        hashMap.put("java",100);
        hashMap.put("java",100);
        hashMap.put("javat",300);
       //hashMap.put(null,100);
      //  hashMap.put(null,300);

        System.out.println("hashMap"+hashMap.size());

       // System.out.println("Hashcode value of obj2"+Hashcode);

    }
}
