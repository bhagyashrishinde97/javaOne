package Collection;

import java.util.ArrayList;
import java.util.List;

public class
Arraylist {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(500);
        list.add(550);
       System.out.println("display the list" +list);

       //  remove the element in 5 index
       list.remove(5);
        System.out.println(list);
        // set the element in 1 position
        list.set(1,300);
        System.out.println(list);
          // get the specific element into list
          list.get(4);

          // add the element in the specific location

          list.add(5, 5600);

        // check the list is empty or not  before adding element o/p:- true
             if(list.isEmpty())
            {
            System.out.println("list is empty"+list.isEmpty());
            };

              //  check the output after adding the element o/p:- false
                   if(!list.isEmpty())
                 {
                  System.out.println("list display after adding element"+list.isEmpty());
                 }


                  // System.out.println(list);

                 // System.out.println(list);


            }
           }
