package ExceptionHandling;

public class ArithmeticException extends Throwable {
    public static void main(String[] args) {
        System.out.println("main method started");
        int a = 100, b = 0, c;
        try {
            c = a / b;
        }catch(Exception ex)
        {

        }
            //System.out.println("not divisible by zero");
        System.out.println("this is end method");
    }
}


