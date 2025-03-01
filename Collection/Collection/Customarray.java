package Collection;

import java.util.Arrays;

public class Customarray {

    int size = 10;
    int count = 0;

    int arr[] = new int[size];

    // Method to print all elements in the array
    public void printall() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("The sum of all elements is: " + getSum());
    }

    // Method to add elements to the array
    public void add(int element) {
        if (count < size) {
            arr[count] = element; // Add element to the array
            count++;              // Increase the count of elements
        } else {
            System.out.println("Array is full. Cannot add more elements.");
        }
    }

    // Method to calculate the sum of all elements
    private int getSum() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method to remove an element (setting to zero as an example)
    public void remove(int index) {
        if (index >= 0 && index < count) {
            arr[index] = 0; // Remove element by setting it to zero
        } else {
            System.out.println("Invalid index.");
        }
        System.out.println("Array after removal: " + Arrays.toString(arr));
    }
        class Array {
            public static void main(String[] args) {
                Customarray s1 = new Customarray();

                // Adding elements to the array
                s1.add(11);
                //  s1.add(2);
                // s1.add(3);
                // s1.add(4);
                // s1.add(5);
                // s1.add(6);
                // s1.add(7);
                // s1.add(8);
                // s1.add(9);

                // Removing an element at index 4
                s1.remove(4);

                // Printing all elements and sum of all elements
                 s1.printall();
            }
        }
    }

