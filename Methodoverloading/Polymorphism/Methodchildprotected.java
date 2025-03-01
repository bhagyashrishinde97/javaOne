package Polymorphism;

import Methodoverloading.MethodProtect;

class Methodchildprotected {
          //@Override
     public void show() {
         System.out.println("this is the child class method");
     }

     public static void main(String[] args) {

         Methodchildprotected m2 = new Methodchildprotected();
         m2.show();

     }
 }