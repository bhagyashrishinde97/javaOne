package Logicalclass;

import java.util.HashMap;
import java.util.Map;

public class Stringcount {
    public static void main(String[] args) {
        String str = "java is a papular programming languagen and java is a platform independant language";
        String[] language = str.split(" ");
        Map<String, Integer> hashmap = new HashMap<>();
        for (String word : language) {
            if (hashmap.containsKey(word)) {
                hashmap.put(word ,hashmap.get(word) + 1);
            } else {
                hashmap.put(word, 1);
            }

        }
        System.out.println(hashmap);


    }
}
