package Collection;

import java.util.Vector;

public class Vectorclass {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());
        for(int i=0;i<=10;i++)
        {
            v.add(1);

        }
        System.out.println(v.capacity());
        v.add("a");
        System.out.println(v.capacity());
        System.out.println(v);
    }

}
