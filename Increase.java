package Collectionprogram;

import java.util.ArrayList;

public class Increase {
    public static void main(String[] args) {
        ArrayList<String> shape=new ArrayList<>();
        shape.add("circle");
        shape.add("trangle");
        shape.add("Rectangle");
        shape.add("round");
        shape.add("hegzagon");
        System.out.println(shape.size());
        int newsize= shape.size()*2;
    }
}
