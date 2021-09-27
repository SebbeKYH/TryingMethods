package com.company;

import java.util.Scanner;

public class Exercise1 {
    public void mainExercise1(){
        System.out.println("This is where the results from exercise 1 are being presented");
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = input.nextDouble();
        System.out.print("Input the Second number: ");
        double y = input.nextDouble();
        System.out.print("Input the third number: ");
        double z = input.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }
    //Method for detemining the smallest number
    public static double smallest(double x, double y, double z) {
        //Troligtvis kan bara match.klassen jämföra två nummer mot varandra.
        return Math.min(Math.min(x, y), z);
    }
}
