package String;

public class Empclass {


        private String name;
        public static void main(String arg[]) {
            Empclass employee1 = new Empclass();
            Empclass employee2 = new Empclass();

            employee1.name="Aditi";
            employee2.name = "komal"
            ;

            String str =new String("java");
            String str1 =new String("java");


            String s1="vani";
            String s2= "vani";

            System.out.println("Employee class Method: ");
            System.out.println(employee1==employee2);
            System.out.println(employee1.equals(employee2));

            System.out.println("String class: ");
            System.out.println(s1==str1);
            System.out.println(str.equals(str1));

            System.out.println("String Literal: ");
            System.out.println(s1==s2);
            System.out.println(s1.equals(s2));

        }
    }

