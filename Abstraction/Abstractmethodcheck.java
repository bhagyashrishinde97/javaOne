package Abstraction;

abstract class Abstractmethodcheck {
    abstract  void m1();

}
class Child1 extends Abstractmethodcheck {

    @Override
    public void m1() {
        String name = "Rajesh";
        int age = 25;
        float salary = 88.3f;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
    class EFG
    {
        public static void main(String[] args) {
          Abstractmethodcheck s1=new Child1();
          s1.m1();
        }
    }

