package Collection;

public class HashCodeAndEquals {

        @Override
    public int hashCode(){return 100;}

    public static void main(String[] args) {
        HashCodeAndEquals obj1=new HashCodeAndEquals();
        System.out.println("HashCode value of obj1 is "+obj1.hashCode());
        HashCodeAndEquals obj2=new HashCodeAndEquals();
        System.out.println("HashCode value of obj1 is "+obj2.hashCode());
        HashCodeAndEquals obj3=null;
        obj3 = new HashCodeAndEquals();
        System.out.println("HashCode value of obj1 is "+obj3.hashCode());


        boolean tt = obj1.equals(obj2);
        System.out.println("Value of tt is "+tt);

    }

    }
 /*System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s));
        System.out.println(s2==s3);
//  System.out.println(s==s2);
// System.out.println(s2==s1);
// System.out.println(s.hashCode());
//System.out.println(s1.hashCode());
// System.out.println(s2.hashCode());
//System.out.println(s3.hashCode());*/

