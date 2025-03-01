package java8features.methodreference;
//@FunctionalInterface
public class Parameterizedconstructor {
    public static void main(String[] args) {
        Methodref m1=Employee::new;
        Employee employee=m1.display(1,"bhagyashri","Nanded");
    }
}
