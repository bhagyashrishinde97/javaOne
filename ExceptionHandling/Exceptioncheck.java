package ExceptionHandling;

public class Exceptioncheck {


    public static void main(String[] args) {
        try {
            int[] list = new int[10];
            System.out.println("list[10] is " + list[10]);
        }
        catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("ArrayIndexOutOfBoundsException");

        } catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        }

    }
}