package Collectionprogram;

import java.util.ArrayList;
import java.util.List;

public class Updatearraylist {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("pink");
        list.add("yellow");
        list.add("orange");
        list.add("blue");
        list.add("red");
        list.add("black");
        System.out.println("display the list before update  the element="+list);
        list.set(1,"Green");
        System.out.println(list);
        System.out.println("display the list  after adding the insert the element="+list);
        System.out.println(list);


    }
}
