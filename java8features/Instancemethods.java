package java8features;

public interface Instancemethods{
   void print();

    }
    class  Methods1
    {
           public Methods1()
           {
               System.out.println("this is constructor");
           }

        public static void main(String[] args) {

           Instancemethods s1=Methods1::new;
           s1.print();

        }
}
