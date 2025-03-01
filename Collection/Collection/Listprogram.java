package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listprogram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aditi");
        list.add("Ashwini");
        list.add("Akangsha");
        list.add("null");
        list.add("null");
        list.add("Anuja");
        list.add("Anjali");
        list.add("Arpita");
        System.out.println(list);
        System.out.println(list.indexOf("Anjali"));
        System.out.println(list.lastIndexOf("Arpita"));
        System.out.println("get list=" + list.get(1));
        list.set(3, "Anjum");
        System.out.println("modify list=" + list);
        list.remove("Anjali");
        System.out.println("remove list" + list);

        for (String name : list) {
            System.out.println(list);
        }
        Iterator<String> itr= list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}