package ExceptionHandling;

public class UncheckedException {
    public static void main(String[] args) {
        int []arr=new int[10];
        arr[999] = 100;
        System.out.println(arr[999]);
    }
}
