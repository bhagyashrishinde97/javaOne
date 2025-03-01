package Abstraction;

interface Abstract {

        int a = 100;
        abstract int show();
        boolean showTrue();
    }

    abstract class BBBB{
        public int a = 100;
        protected abstract int show();
    }
    class TestInterfaceProgram {
        //whatever final, you can not change it's value
        //pi = 3.144
        static int nonFinal = 100;
        static final int finalVariable = 200;

        public static void main(String[] args) {
            nonFinal = 300;
            //  finaVariable = 400;
            nonFinal = 700;
        }

    }

