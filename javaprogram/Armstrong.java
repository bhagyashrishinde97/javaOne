package javaprogram;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stu
		  int n, temp;      
	          int sum=0,d;
		     
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter any Number");
		      n=sc.nextInt();
		      temp=n;
		     
		    	  while(n != 0) {
		              d = n % 10;     
		              sum= sum+(d*d*d); 
		              n = n / 10;     
		              
		      }
		      if(temp==sum)
		      {
		    	  System.out.println("Number is Armstrong");
		      }
		      else
		      {
		    	  System.out.println("Number is not Armstrong");
		      }

	}

}
