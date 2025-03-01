package java8features;

 interface Parameter
 {
     void add(int n1,int n2);
 }
 class Parameterized
 {
     public static void main(String[] args) {
         Parameter p1=(n1,n2)-> {
             System.out.println("addition=" + (n1 + n2));
         };
         p1.add(10,20);

         {

         }
     }
 }

