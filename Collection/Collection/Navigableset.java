package Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigableset {
    public static void main(String[] args) {

                NavigableSet<Integer> navSet = new TreeSet<>();

                navSet.add(10);
                navSet.add(20);
                navSet.add(30);
                navSet.add(40);
                navSet.add(50);

                System.out.println("NavigableSet Elements: " + navSet);

                // Lower, Floor, Ceiling, Higher methods
                System.out.println("Lower than 30: " + navSet.lower(30));  // 20
                System.out.println("Floor of 30: " + navSet.floor(30));    // 30
                System.out.println("Ceiling of 30: " + navSet.ceiling(30)); // 30
                System.out.println("Higher than 30: " + navSet.higher(30)); // 40

                // Reverse order
                System.out.println("Reverse Order Set: " + navSet.descendingSet());
            }
        }



