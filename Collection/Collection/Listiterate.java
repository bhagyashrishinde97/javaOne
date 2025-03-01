package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listiterate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("samir");
        list.add("sujata");
        list.add("shrikant");
        list.add("suraj");
        for (String s1 : list) {



            System.out.println(s1);
        }

    }

}