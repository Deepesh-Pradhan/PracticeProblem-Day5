package com.bridgelabz.javabasics.day5;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double root1 = 0, root2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'a' value");
        int a = scanner.nextInt();
        System.out.println("Enter the 'b' value");
        int b = scanner.nextInt();
        System.out.println("Enter the 'c' value");
        int c = scanner.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("roots are: " + root1 + " , " + root2);
        } else if (delta == 0) {
            double root = -b / 2 * a;
            System.out.println("root is " + root);
        } else {
            System.out.println("roots are not correct");
        }
    }
}