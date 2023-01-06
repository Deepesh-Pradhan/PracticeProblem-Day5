package com.bridgelabz.javabasics.day5;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the Second number : ");
        int number2 = scanner.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("Quotient for given numbers is: " + quotient);
        System.out.println("Remainder for given number is: " + remainder);
    }
}
