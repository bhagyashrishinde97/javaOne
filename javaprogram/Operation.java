package javaprogram;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n1=Integer.parseInt(args[0]);
  int n2=Integer.parseInt(args[1]); 
  char opr=args[2].charAt(0);
  int ans=0;
  switch(opr)
  {
  case '+':
  ans=n1+n2;
  break;
  case '-':
  ans=n1-n2;
  break;
  case '*':
  ans=n1*n2;
  break;
  case '/':
  ans=n1/n2;
  break;
  default:
	  System.out.println("");
  
  }
  
  
  
	}

}
