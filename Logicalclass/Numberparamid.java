package Logicalclass;

//How To Create Pyramid Of Numbers In Java
    public class Numberparamid {
        public static void main(String[] args) {


            int n = 9;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k +" ");
                }
                System.out.println();
            }




                 }
        }

//output
  /*    1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9 */
