package Constructor;

public class ThisKeyword {
    ThisKeyword()
    {
     this("java");
     System.out.println("this is no-argument Constructor");
    }
       ThisKeyword(String a)
    {
        this(100, "Java Programming");
      System.out.println("this is String argument Constructor");
    }
    ThisKeyword(int a)
    {
        this();
        System.out.println("this is in argument Constructor");
    }
    ThisKeyword(int zz, String xx) {


        System.out.println("this is String and int argument Constructor");
    }

    public static void main(String[] args) {
        ThisKeyword tt= new ThisKeyword(100);
    }

}
