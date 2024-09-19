package javaprogram;

public class Book1 {
	 int bid,price;
	 String title;

	 public Book1(int bid,String title,int price)
	 {
		 this.bid=bid;
		 this.title="java";
		 this.price=500;
	 }
	 public Book1() {
		// TODO Auto-generated constructor stub
	}
	 public void display()
	 {
		 System.out.println("bid="+bid);
		 System.out.println("title="+title);
		 System.out.println("price="+price);
	 }
	public static void main(String[] args) {
		// TODO Auto-gener ated method stub
   Book1 b1=new Book1(1,"java",500);
   b1.display();
   Book1 b2=new Book1();
   b2.display();
   
   
	}

}
