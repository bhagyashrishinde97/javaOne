package javaprogram;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of n");
     int n=sc.nextInt();
     int a=1,sum=0;
     while(a<=n)
     {
    	 sum+=a;
    	 a++;
     }
     System.out.println("sum="+sum);
     sc.close();
	}

}
