package com.bridgelabz.javabasics.day5;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y : ");
        int y = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The Distance from the point " + x + " " + y + " to the origin (0, 0) is: " + distance);
    }
}
