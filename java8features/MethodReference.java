package java8features;

 interface Methodreference
 {
      void show();
 }

 class Method1
 {
     public static  void show()
     {
         System.out.println("this is static method");
     }

     public static void main(String[] args)
     {

         Methodreference r1 = Method1::show;
         r1.show();
     }
     }
     interface   Instancereference
{
       public void m1();
}
class Instance {
    public void show()
    {
        System.out.println("this is instance method");
    }

    public static void main(String[] args) {
        Instance i1=new Instance();
        Instancereference s1=i1::show;
        i1.show();
        s1.m1();
    }
}