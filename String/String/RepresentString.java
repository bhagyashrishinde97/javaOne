package String;

public class RepresentString {
    public static void main(String[] args) {

            {
                String s1 = "JAVA";

                String s2 = new String("JAVA");

                String s3 = s2.intern();

                System.out.println(s2 == s1);
            }
        }
}
