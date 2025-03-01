package Logicalclass;
//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
// write a program to print armstrong number
class CheckArmStrong{
    public static void main(String str[]){
        int n=153; int c=0,a;  int temp ;
        temp=n;

        while(n>0){
            a=n%10;  n=n/10;  c=c+(a*a*a);
            System.out.println(a+"  "+n+"  "+c);  // to see the logic
        }
        if(temp==c)  System.out.println("Armstrong number");
        else      System.out.println(" Not Armstrong number");
    }
}






