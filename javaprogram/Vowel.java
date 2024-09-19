package javaprogram;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        String input = "Hello World"; // Sample input string
		        int vowelCount = 0, consonantCount = 0;

		        // Convert the input string to lower case to handle case insensitivity
		        input = input.toLowerCase();

		        // Define vowels
		        String vowels = "aeiou";

		        // Iterate through each character of the string
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		            // Check if the character is a letter
		            if (Character.isLetter(ch)) {
		                if (vowels.indexOf(ch) != -1) {
		                    // Character is a vowel
		                    vowelCount++;
		                } else {
		                    // Character is a consonant
		                    consonantCount++;
		                }
		            }
		        }

		        // Print the result
		        System.out.println("Number of vowels: " + vowelCount);
		        System.out.println("Number of consonants: " + consonantCount);
		    }
		

	}


