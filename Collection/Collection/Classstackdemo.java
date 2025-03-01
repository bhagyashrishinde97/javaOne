package Collection;

import java.util.Stack;

public class Classstackdemo {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("Aditi");
        s.push("Prajakta");
        s.push("Dakshta");
        System.out.println(s);
        System.out.println(s.search("Prajakta"));
        System.out.println(s.search("Dakshta"));
        System.out.println(s.search("Bhagyashri" ));
    }
}
//o/p
//[Aditi, Prajakta, Dakshta]
     //   2
      //  1
      //  -1
