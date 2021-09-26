package com.company;
import java.util.Scanner;

public class Exercise3 {
    public static void mainExercise(String[]arg){
        Scanner inputString = new Scanner(System.in);
        System.out.print("Input a string: ");
        String word = inputString.nextLine();
        System.out.print("The middle character in the string: " + middle(word)+"\n");
    }
    public static String middle(String word){
        int position;
        int length;
        if(word.length()%2==0){
            position =word.length()/2-1;
            length=2;
        }
        else{
            position=word.length()/2;
            length=1;
        }
        return word.substring(position,position+length);
    }
}
