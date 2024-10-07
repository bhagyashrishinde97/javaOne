package Static;


	public class BlockInJava {
		
	    static {                                                                 // Static block
	        System.out.println("This is static block ");
	    }
	       // for static block no need to create object of it
	     {
	        System.out.println("This is Non-Static / Instance block ");          // Instance block
	    }
	     BlockInJava (){                                                  // Constructor
	        System.out.println("This is Constructor");
	    }
	    void test (){
	        System.out.println("This is method in class ");                 // simple method  / Local method
	    }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("This is Main method ");
       BlockInJava B = new BlockInJava();
        B.test();
	}
	// Main method
    }
	


