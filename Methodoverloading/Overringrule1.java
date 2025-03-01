package Methodoverloading;

 class Overidingrule1 {
   public  void show() {
         System.out.println("This is Overringrule1");
     }
     public int add(int a, int b)
     {
         return a+b;
     }
 }
    class Overidingrulechild extends Overidingrule1 {
        public void show() {
            System.out.println("This is Overidingrulechild meth");
        }

        public int add(int a, int b) {
            return a + b;
        }
    }
        class Main {
            public static void main(String[] args) {
                Overidingrule1 s1 = new Overidingrulechild();
                s1.show();
                System.out.println("this is the add"+s1.add(10,20));
                System.out.println("this is child class"+s1.add(10,30));
                //Overidingrule1 s2 = new Overidingrulechild();
              //  s2.show();

                }
            }


