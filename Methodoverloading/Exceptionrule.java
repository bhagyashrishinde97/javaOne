package Methodoverloading;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptionrule {
    public void show() throws IOException {
        System.out.println("this is IOException");
    }
}
class Abcd extends Exceptionrule
{
    public void show() throws FileNotFoundException
    {
        System.out.println("this is Abcd class exception");
    }

    public static void main(String[] args) throws IOException {
        Exceptionrule exceptionrule=new Exceptionrule();
        exceptionrule.show();
    }
}

