package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedsetclass {
    public static void main(String[] args) {
        SortedSet<Integer> s1=new TreeSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(10);

        System.out.println(s1);
        System.out.println(s1.comparator());
        System.out.println(s1.first());
        System.out.println(s1.last());
        System.out.println(s1.headSet(40));
        System.out.println(s1.tailSet(30));
        System.out.println(s1.subSet(20,40));

    }
}
