package javaprogram;

import java.util.Scanner;

public class Reversen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value of n");
				int n=sc.nextInt();
				int rev=0;
			
			
				while(n!=0)
				{
					int r=n%10;
					 rev = r + rev * 10;
					 n=n/10;
					
			
				}
				System.out.println("Reverse Number="+rev);

			}
	}


