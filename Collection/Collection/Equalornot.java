package Collection;

public class Equalornot {
    public static void main(String[] args) {

        String s="simma";
        String s1="simma";
        String s2=new String("simma");
        String s3=new String("Shita");
       /* Hashcode obj1=new Hashcode();
        System.out.println("obj1"+obj1.hashCode());
        Hashcode obj2=new Hashcode();
        System.out.println("obj2"+obj2.hashCode());
        System.out.println( obj1.equals(obj2));*/
        System.out.println("hashcode"+s1.hashCode());
        System.out.println("hashcode"+s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);


    }
}
