package Array;

public class Findmax3 {
    public static void main(String[] args) {
       int max=0;
        int[]arr={300,100,120,340,8898};
        for( int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
               max= arr[i];
        }
        System.out.println("Print Largest no"+max);

    }
}
