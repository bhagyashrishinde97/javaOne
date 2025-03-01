package String;

public class Employee {

    public static void main(String[] args) {
        String s1="java";
        String s2="Programming";
        String s3=new String("java");
        String s4=new String("Programming");
       // Employee s1=new Employee();
       // Employee s2=new Employee()
        // Employee s3=new Employee();
       // Employee s4=new Employee();
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s2==s4);
        System.out.println(s3==s4);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }
}
