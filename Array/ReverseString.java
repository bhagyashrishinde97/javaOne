package Array;

import static Array.FindMaxArray.arr;

public class ReverseString {
    public static void main(String[] args) {
        String[] arr = new String[]{"sachin", "sidhant", "swapnil"};
        System.out.println("Orignal String");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
        System.out.println("Reverse String");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + "");

        }
    }
}


