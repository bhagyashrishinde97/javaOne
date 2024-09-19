package Constructor;

public class Const1 {
    int bid,price;
    String title;

    Const1(int bid,int price,String title)
    {
        this.bid=1;
       this.title = "c++";
      this.price=500;
    }

public void display()
{
    System.out.println("bid="+bid);
    System.out.println("display title="+title);
    System.out.println("price="+price);

}

public static void main(String[] args) {
    Const1 s1 = new Const1(1,500,"c++");
    s1.display();
    Const1 s2 = new Const1(2,400,"java");
    s2.display();
}
}
