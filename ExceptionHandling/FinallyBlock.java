package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(" Exception block excuted");
            e = null;
            e.getMessage();

            try {
                int a = Integer.parseInt("123");
                e.getMessage();
            } catch (NumberFormatException ae) {
                System.out.println("NUmberFormat Exception");
            } catch (NullPointerException npe) {
                System.out.println("got NullPointer Exception");
            } catch (Exception ee) {
                System.out.println("Exception Catch Block");
            }
            System.out.println("test method");
        } finally {
            System.out.println("this block will alwase excuted whether exception is occure or not in try block");
        }
    }
}