package String;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
      java.lang.String s1="HELLO";
      for(int i=0;i<s1.length();i++)
      {
    	  char ch=s1.charAt(0);//H
    	  s1=s1.substring(1);//ELLo
    	  s1=s1+ch;//ELLoH
    	  System.out.println(s1);
      }

	}

	public java.lang.String concat;

	public String[] split(java.lang.String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
