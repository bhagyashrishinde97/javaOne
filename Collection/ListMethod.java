package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("display result before  adding element" + list.size());
        list.add(100);
        list.add(300);
        list.add(350);
        list.add(400);
        list.add(450);
        list.add(500);
        System.out.println("display result after adding element" + list);
        for (Integer s : list) {
            System.out.println(s);
        }
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        list.set(1, 200);
        list.set(3, 550);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}

       // System.out.println("display result removing index 4 element"+list.size());
       // list.remove(4);
      //  System.out.println("display result removing index 2 element"+list.size());
      // list.add(2);
     // System.out.println("display result after adding 2 index element"+list.size());

    //}
//}
