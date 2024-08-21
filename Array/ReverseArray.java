package Array;

import static Array.FindMaxArray.arr;

public class ReverseArray {
    public static void main(String[] args) {
        //rignal Array
        int[] arr = new int[]{1, 2, 3, 4, 5};
        {
            System.out.println("Orignal Array");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
        System.out.println("Reverse Array");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + "");

        }
    }
}