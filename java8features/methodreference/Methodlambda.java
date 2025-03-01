package java8features.methodreference;

import java.util.Arrays;
import java.util.List;

public class Methodlambda {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("sachind","shrdha","sujata","shravani","sushma");

        list.stream().forEach( item->System.out.println(item));

    }
}
