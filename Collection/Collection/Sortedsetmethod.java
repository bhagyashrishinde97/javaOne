package Collection;
import java.util.SortedSet;
import java.util.TreeSet;
public class Sortedsetmethod {



        public static void main(String[] args) {
            // Creating a SortedSet using TreeSet
            SortedSet<String> fruits = new TreeSet<>();

            // Adding elements
            fruits.add("Apple");
            fruits.add("Mango");
            fruits.add("Banana");
            fruits.add("Orange");
            fruits.add("Greaps");
            fruits.add("pink");
           // fruits.add(null);

            // Displaying elements (Sorted order)
            System.out.println("Sorted Set: " + fruits);

            // First and Last elements
            System.out.println("First Element: " + fruits.first());
            System.out.println("Last Element: " + fruits.last());

            // Subset operations
            System.out.println("HeadSet (before Mango): " + fruits.headSet("Mango"));
            System.out.println("TailSet (from Mango onwards): " + fruits.tailSet("Mango"));
        }
    }


