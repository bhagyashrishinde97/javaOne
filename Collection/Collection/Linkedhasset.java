package Collection;

import java.util.LinkedHashSet;

public class Linkedhasset {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet=new LinkedHashSet<>();
    linkedHashSet.add("Apple");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Sujata");
        linkedHashSet.add("Mango");
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
    }
}
