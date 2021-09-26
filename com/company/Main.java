package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("This is the Sebastian branch");

        Scanner input = new Scanner(System.in);

        //int firstNumber=input.nextInt();
        //int divided=divideMetod(firstNumber);
        //System.out.println(divided);

        //Exercise 1 Write a Java method to find the smallest number among three numbers
        System.out.print("Input the first number: ");
        double x = input.nextDouble();
        System.out.print("Input the Second number: ");
        double y = input.nextDouble();
        System.out.print("Input the third number: ");
        double z = input.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );

        System.out.println("The average value is " + average(x, y, z));

        Exercise3 inputAverage = new Exercise3();
        }
        //Method for detemining the smallest number
    public static double smallest(double x, double y, double z)
    {
        //Troligtvis kan bara match.klassen jämföra två nummer mot varandra.
        return Math.min(Math.min(x, y), z);
    }
        //Exercise 2 Write a Java method to compute the average of three numbers
    public static double average(double x, double y, double z){
        return (x + y + z) / 3;
    }

    public static int divideMetod (int firstNumber){
        int results =(firstNumber/2);
        return results;
        }

}


