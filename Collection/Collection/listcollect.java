package Collection;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listcollect {
        public static void main(String[] args) {


            List <String> ll=new ArrayList<>();
            ll.add("Aditi");
            ll.add("Pooja");
            ll.add("Akangsha");
            ll.add("Aditya");
            ll.add("Suraj");

            ll.add("Dakshata");
            ll.add("Rohit");
            ListIterator<String> li = ll.listIterator();
            while (li.hasNext()) {
                li.next();
            }
            System.out.println("The ArrayList elements in the reverse direction are: ");
            while (li.hasPrevious()) {
                System.out.println(li.previous());
            }



        }
    }

