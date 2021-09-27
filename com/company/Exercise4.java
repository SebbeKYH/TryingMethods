package com.company;
import java.util.Scanner;

public class Exercise4 {
    public void mainExercise4(){
        // Write a Java method to count all vowels in a string.
        System.out.println("This is where the results from exercise 4 are being presented");
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string: ");
        String vowelWord = input.nextLine();

        System.out.print("Number of  Vowels in the string: " + count_Vowels(vowelWord)+"\n");
    }
    public static int count_Vowels(String vowelWord) {
        int count = 0;
        for (int i = 0; i < vowelWord.length(); i++)
        {
            if (vowelWord.charAt(i) == 'a' || vowelWord.charAt(i) == 'e' || vowelWord.charAt(i) == 'i'
                    || vowelWord.charAt(i) == 'o' || vowelWord.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
