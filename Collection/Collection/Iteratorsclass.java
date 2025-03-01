package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iteratorsclass {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList<>();
        l1.add("Sujata");
        l1.add("Swapnil");
        l1.add("Shrikant");
        l1.add("Shravani");
        l1.add("Pradip");
        l1.add("Pranjali");
        System.out.println("starting list"+" " +l1);
        ListIterator<String> itr = l1.listIterator(l1.size());
        while (itr.hasNext()) {

            String s1 = itr.next();
            if (s1.equals("Sujata")) ;
            {
                itr.set("Dakshta");
            }

        }
        System.out.println("adding the list after replace the name Sujata to Dakshta" + l1);

        // display the list in backword direction
       // System.out.println("traversing in reverse order");
        // give the listiterator size will be must
       // ListIterator<String> itr = l1.listIterator(l1.size());
            while (itr.hasPrevious()) {

             String s1 =itr.previous();
              System.out.println(s1);



        }
            // add the element in index

           itr = l1.listIterator(3);
          l1.add("Shravani");
          System.out.println(l1);

           itr = l1.listIterator(); // Reset iterator to the start
          while (itr.hasNext()) {
            String s2 = itr.next();
            if (s2.equals("Pranjali")) {
                itr.remove();
            }
        }
           System.out.println("final list after removing Pranjali" + l1);
    }
}
