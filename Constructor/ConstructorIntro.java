package Constructor;

public class ConstructorIntro {
    ConstructorIntro()
    {
        System.out.println("This is constructor method");
    }
    public void ConstructorIntro()
    {
        System.out.println("This is normal method");
    }
  int add(int a, int b)
    {
      System.out.println("This is add method");
      return a+b;
    }

    public static void main(String[] args) {
        ConstructorIntro s1=new ConstructorIntro();
       // s1.add(10,20);
       s1.ConstructorIntro();
    }
}
