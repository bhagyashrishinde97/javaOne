package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionsort implements Comparable<Collectionsort> {


    int rollno, marks;

    String name;


    public Collectionsort() {

    }

    public Collectionsort(int rollno, int marks, String names) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = names;


    }

    @Override
    public String toString() {
        return "Collectionsort{ rollno=" + rollno + ", name=" + marks + ",Marks= " + name + "}";
    }


    @Override
    public int compareTo(Collectionsort o) {
        if (marks < o.marks) {
            return 1;
        } else if (marks > o.marks) {
            return -1;
        } else
            return 0;
    }


    public static class Collectionlist {


        public static void main(String[] args) {
            List<Collectionsort> list = new ArrayList<Collectionsort>();
            list.add(new Collectionsort(1, 75, "Sachin"));
            list.add(new Collectionsort(2, 95, "Shrikant"));
            list.add(new Collectionsort(3, 69, "Suraj"));
            list.add(new Collectionsort(4, 85, "Suyash"));


            System.out.println("Without Sort");
            for (Collectionsort s1 : list) {

                System.out.println(s1);
            }



            System.out.println("After sort");


            Collections.sort(list);

            
            for (Collectionsort s2 : list) {

                System.out.println(s2);
            }


        }
    }
}