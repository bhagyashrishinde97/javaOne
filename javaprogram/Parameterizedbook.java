package javaprogram;

public class Parameterizedbook 
{
	int bid,price;
	String title;
	public Parameterizedbook(int Bid,int price,String title)
	{
		bid=Bid;
		title=title;
		price=price;
	}
	public void display()
	{
		System.out.println(bid=+bid);
		System.out.println(title=+title);
		System.out.println(price=+price);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Parameterizedbook b1= new Parameterizedbook (1, 500,"java");
   b1.display();
   Parameterizedbook b2= new Parameterizedbook (2,400,"c");
   b2.display();
	}

}
