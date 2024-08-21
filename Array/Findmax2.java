package Array;

public class
Findmax2 {
    public static void main(String[] args) {

        int max = 0;
        int[] arr = {110, 220, 300, 600};

        // System.out.println("Find Max Array");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("print largest number" + max);
    }
}







