package Methodoverloading;

import java.io.IOException;

public class Exceptionrule2 {
    protected void show()
    {
        System.out.println("this is ioexception in java");
    }
    class Exceptionchild extends Exceptionrule2 {
        protected void show() throws ArrayIndexOutOfBoundsException {
            System.out.println("this is Exception child method");
        }
    }

        public static void main(String[] args) {
          Exceptionrule2  ec2=new Exceptionrule2();
          ec2.show();


        }
    }

