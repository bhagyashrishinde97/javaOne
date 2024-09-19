package Operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bitwise operators
        int m = 5, n = 3;
        System.out.println("Bitwise Operators:");
        System.out.println("m & n : " + (m & n));   // Bitwise AND
        System.out.println("m | n : " + (m | n));   // Bitwise OR
        System.out.println("m ^ n : " + (m ^ n));   // Bitwise XOR
        System.out.println("~m : " + (~m));         // Bitwise Complement
        System.out.println("m << 1 : " + (m << 1)); // Left shift
        System.out.println("m >> 1 : " + (m >> 1)); // Right shift
        System.out.println();

	}

}
