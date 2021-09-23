package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the Sebastian branch");

        Scanner input = new Scanner(System.in);

        int firstNumber=input.nextInt();
        int divided=divideMetod(firstNumber);
        System.out.println(divided);
        }

    public static int divideMetod (int firstNumber){
        int results =(firstNumber/2);
        return results;
        }
}


