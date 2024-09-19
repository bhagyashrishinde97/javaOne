package javaprogram;

public class Book {
	int bid,price;
	  String title;
	  Book(int id,String title,int price)
	  {
		 this.bid=id;
		this.title=title;
		 this.price=price;
	  }
	  public void display()
	  {
		  System.out.println("BookId="+bid);
		  System.out.println("title="+title);
		  System.out.println("price="+price);
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"java",500);
		   b1.display();
		   Book b2=new Book(2,"c++",400);
		   b2.display();
			}
	}


