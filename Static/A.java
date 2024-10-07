package Static;

public class A 
{
	
	    static int m=100;//static variable  
	    void method()  
	    {    
	       System.out.println("This is local method");//local variable    
	    }  
	     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println((A.m));
	A a=new A();
	a.method();
	}//end of class

}
