package Collection;
import java.util.*;
class
EnumerationDemo {
   public static void main(String[] args) {
      Vector<Integer> v1 = new Vector<>();
      for (int i = 0; i < 10; i++) {
         v1.addElement(i);
      }
      System.out.println(v1);
      Enumeration e1 = v1.elements();
      while (e1.hasMoreElements()) {
         Integer i = (Integer) e1.nextElement();
         if (i % 2 == 0) {
            System.out.println(i);

         }
      }
   }
}