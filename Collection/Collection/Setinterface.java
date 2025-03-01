package Collection;

import java.util.HashSet;
import java.util.Set;

public class Setinterface {
    public static void main(String[] args) {


        Set<String> s1 = new HashSet<>();

        s1.add("Sachin");
        s1.add("Shrikant");
        s1.add("Suraj");
        s1.add("Swapnil");
        s1.add("Shrdha");
        s1.add("Shrdha");
        s1.add("null");
        s1.add("null");
        System.out.println(s1);
        System.out.println("Shrdha".hashCode());
        System.out.println("Shrdha".hashCode());
        System.out.println("null".hashCode());
        System.out.println("null".hashCode());
        System.out.println("Sachin".hashCode());

    }
}