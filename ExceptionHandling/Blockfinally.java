package ExceptionHandling;



public class Blockfinally {
    public static void main(String[] args) {
        try
        {
            int i=10/0;
           ;
        }

        finally {
            System.out.println("this is the finally block in java");
        }
    }
}
