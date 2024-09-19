package javaprogram;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter the value of n");
		   int n=sc.nextInt();
		   int fact=1;
		   while(n>=1)
		   {
			   fact=fact*n;
			   n--;
		   }
		   System.out.println("factorial="+fact);

	}

}
