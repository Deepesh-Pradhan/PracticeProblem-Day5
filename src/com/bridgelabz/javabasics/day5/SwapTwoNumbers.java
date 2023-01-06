package com.bridgelabz.javabasics.day5;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number= ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second Number= ");
        int number2 = scanner.nextInt();
        int temporary;
        temporary = number1 + number2;
        number1 = temporary-number1;
        number2 = temporary - number2;
        System.out.println("After Swaping Number1 and Number2 is : " +number1+ " " +number2);
    }
}