package java8features.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Streamlists {
    public static void main(String[] args)
    {
        List<String> list=Arrays.asList("Sameer","Shital","Suraj","Shrikant","Swapnil");
        Optional<String> longestlist=list.stream().max(Comparator.comparingInt(String::length));
        System.out.println(longestlist);

    }
}
