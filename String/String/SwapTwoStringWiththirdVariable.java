package String;

public class SwapTwoStringWiththirdVariable {
    public static void main(String[] args) {
       String str1="12345";
       String str2="67899";
       System.out.println("Before Swapping");
       System.out.println("str1="+str1);
        System.out.println("str2="+str2);
        String temp;
        temp=str1;
        str1=str2;
        str2=temp;
        System.out.println("After Swapping");
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);
    }
}
