package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {


//write a program to print String in reverse order
        public static void main(String[] args) {
            List<String> colors = new ArrayList<>();
            colors.add("Pink");
            colors.add("Orange");
            colors.add("Purple");
            colors.add("Blue");
            colors.add("Yellow");
            colors.add("Black");
            colors.add("Red");

            System.out.println("Original List ");
            System.out.println(colors);
            System.out.println("List after sorting....");
            Collections.reverse(colors);
            System.out.println(colors);
        }
    }

