package ExceptionHandling;

public class SimpleTest

{

    void divideTest(int a, int b){

        int aa = a / b;
        System.out.println("Value of division is "+aa);
    }


    //stack trace

    public static void main(String[] args) {
        System.out.println("Main method");
        SimpleTest ooo =  new SimpleTest();
        ooo.divideTest(100,0);
        System.out.println("Execution of main method is done");

    }
}


