package com.company;

import java.util.Scanner;

public class Exercise2 {
    public void mainExercise2(){
        System.out.println("This is where the results from exercise 2 are being presented");
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = input.nextDouble();
        System.out.print("Input the Second number: ");
        double y = input.nextDouble();
        System.out.print("Input the third number: ");
        double z = input.nextDouble();
        System.out.println("The average value is " + average(x, y, z));
    }
    public static double average(double x, double y, double z){
        return (x + y + z) / 3;
    }

    public static int divideMetod (int firstNumber){
        int results =(firstNumber/2);
        return results;
    }
}
