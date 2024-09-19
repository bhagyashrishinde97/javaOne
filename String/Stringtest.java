package String;
import java.util.*;
import java.lang.*;
public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      java.lang.String s1="this is test";
         java.lang.String[] s2 = s1.split("");
        for(java.lang.String str:s2)
        {
        	System.out.println(str);
        }
        for(int i = 0;i<s2.length;i++)
        {
        	System.out.println(s2[i]);
        }  
        
	}

}
