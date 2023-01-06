package com.bridgelabz.javabasics.day5;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("Given number is an even number");
        }
        else {
            System.out.println("Given number is an odd number");
        }
    }
}
