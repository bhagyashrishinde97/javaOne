package javaprogram;

public class Constructor {
        int bid,  price;
      String title;
      public Constructor()
      {
    	  bid=1;
    	  title="java";
    	  price=500;
      }
      
      public void display()
      {
    	  System.out.println("bid="+bid);
    	  System.out.println("title="+title);
    	  System.out.println("price="+price);
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
       Constructor b1=new Constructor();
       b1.display();
       Constructor b2 = new Constructor();
       b2.display();
       
	}
}