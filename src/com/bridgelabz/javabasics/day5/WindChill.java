package com.bridgelabz.javabasics.day5;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Temperature in F : ");
        int Fahrenheit = scanner.nextInt();
        System.out.println("Enter the Wind speed : ");
        int windSpeed = scanner.nextInt();
        if(Math.abs(Fahrenheit) > 50 || windSpeed > 120 || windSpeed < 3 ){
            System.out.println("Enter Correct input");
        }
        else {
            double w = 35.74 + (0.62158 * Fahrenheit) + (((0.4275 * Fahrenheit)- 35.75) * Math.pow(windSpeed, 0.16));
            System.out.println("Wind chill will be : "+w);
        }
    }
}