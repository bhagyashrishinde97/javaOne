package javaprogram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n,temp;
     int rev=0,d;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any Number");
      n=sc.nextInt();
      temp=n;
     
    	  while(n != 0) {
              d = n % 10;     // Get the last digit
              rev = rev * 10 + d; // Build the reversed number
              n = n / 10;     // Remove the last digit
              
      }
      if(temp==rev)
      {
    	  System.out.println("Number is Palindrome");
      }
      else
      {
    	  System.out.println("Number is not Palindrome");
      }
     
     
	}

}
