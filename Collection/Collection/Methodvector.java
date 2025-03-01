package Collection;

import java.util.Vector;

public class Methodvector {
    public static void main(String[] args) {
        Vector<String> v1=new Vector<>();
        v1.add("Sanket");
        v1.add("Savita");
        v1.add("Shri");
        v1.add("Shrikant");
        v1.add("Swapnil");
        System.out.println(v1.remove("Shrikant"));
        System.out.println(v1.indexOf("Savita"));
        System.out.println(v1.capacity());
        v1.add("Basanti");
        System.out.println(v1);
    }
}
