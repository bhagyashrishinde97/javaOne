package java8features;

 interface ReturnKeyword
 {
     int add(int n1, int n2);
 }
 class Return
 {
     public static void main(String[] args) {
         ReturnKeyword r1=(n1,n2)->{
             return n1+n2;
         };
         System.out.println("addition"+r1.add(40,60));
     }
 }