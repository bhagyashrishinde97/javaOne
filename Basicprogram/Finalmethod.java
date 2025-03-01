package Basicprogram;

public class Finalmethod {

    public final void show(Object o) {
        System.out.println("BaseClass method");
    }
    }
    class DerivedClass extends Finalmethod {
        public void show(Integer i) {
            System.out.println("DerivedClass method");
        }
    }

     class Test {
    void show()
    {
        System.out.println("this is show method");
    }
        public static final void main(String[] args) {
        // declaring main () method with final keyword.
            Test t1=new Test();
            t1.show();
           Finalmethod b = new Finalmethod();
            System.out.println(10);
           DerivedClass d = new DerivedClass();
            System.out.println(20);

        }
    }

