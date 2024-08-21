package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafeIterator {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Pune");
        list.add("Mumbai");
        list.add("Chennai");
        list.add("Hydrabad");
        list.add("Sambhajinagar");
        Iterator<String> iterator =list.iterator();
        while(iterator.hasNext())
        {
            String temp= iterator.next();
            System.out.println(temp);
            iterator.remove();
        }
    }
}
