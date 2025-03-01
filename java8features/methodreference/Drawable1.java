package java8features;

@FunctionalInterface
public interface Drawable1 {
    int m1(int a, int b); // Change the return type to int
}

class Lamdademo2 {
    public static void main(String[] args) {
        Drawable d1 = (a, b) -> a + b; // Simplify the lambda
        System.out.println("addition = " + d1.m1(10, 20));
    }
}

