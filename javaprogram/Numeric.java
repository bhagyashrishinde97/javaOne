package javaprogram;

public class Numeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		if(n1>n2 && n1>n3)
		{
			System.out.println("Greater Number="+n1);
		}
		else if(n2>n3)
		{
			System.out.println("Greater Number="+n2);
		}
		else
		{
			System.out.println("Greater Number="+n3);
		}
			
	}

	}
    
