package Inheritance;

 class Herarchical {
     public void show() {
         System.out.println("This is show method Parent");
     }
 }
     class Sachin extends Herarchical {
         public void Sachin() {
             System.out.println("This is Sachin");
         }

     }
         class Nitin extends Herarchical {
             public void Nitin() {
                 System.out.println("This is Nitin");
             }

         }
              class Ankit {
                 public  static void main(String[] args) {
                     Nitin a1 = new Nitin();
                     Sachin aa=new Sachin();
                     a1.show();
                     aa.Sachin();
                     a1.show();
                     a1.Nitin();
                 }
             }






