package Logicalclass;

import java.util.Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sort array" + Arrays.toString(array));
        int sizes = (array[size - 2]);
        System.out.println("display array=" + sizes);

    }
}

