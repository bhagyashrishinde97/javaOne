package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylistmethods {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();


     list.add(null);
     list.add("samir");
     list.add("sujata");
     list.add(null);
        System.out.println(list);
        System.out.println(list.hashCode());
    }
}
