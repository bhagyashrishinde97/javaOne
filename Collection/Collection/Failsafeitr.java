package Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Failsafeitr {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Sanket");
        list.add("Sachin");
        list.add("Shrinivas");
        list.add("Suyash");
        Iterator<String> iterator= list.iterator();
        while(iterator.hasNext())
        {
            String temp= iterator.next();
            System.out.println(temp);
                }

    }
}
