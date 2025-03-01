package String;

public class Equalsandequalsoperator {



    public static void main(String[] args) {
        String s="simma";
        String s1="simma";
        String s2=new String("simma");
        String s3=new String("Shita");



        System.out.println(s.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s==s2);
        System.out.println(s1==s2);
       System.out.println(s2==s3);
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());





    }
}


