package Collection;

import java.util.ArrayList;
import java.util.List;

public class FailFastIterator {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Dilhi");
        list.add("Mumbai");
        list.add("Hydrabad");
        list.add("Nagpur");
        for(String s : list)
        {
            list.add("Latur");
            System.out.println(s);
        }

    }
}
