package java8features;


interface Fun {
    void dummy();

    default void show() {
        System.out.println("default method is part of interface +after java 8 we can write our business logic or implementation in default method");
    }

    public static void display() {
        System.out.println("This is static method");
    }

    class FunctionalInterface implements Fun {
        @Override
        public void dummy() {
            System.out.println("This is abstract method");
        }
       // @Override
        public  void show() {
           System.out.println("This is parent class default method");
       }
    }


    public static void main(String[] args) {
        FunctionalInterface f1 = new FunctionalInterface();
         f1.show();
       f1.dummy();
      // f1.show();

        // f1.show();
        Fun.display();

    }
}

