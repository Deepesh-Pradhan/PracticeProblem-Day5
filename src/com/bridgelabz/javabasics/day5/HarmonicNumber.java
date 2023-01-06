package com.bridgelabz.javabasics.day5;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = scanner.nextInt();
        double value = 0;
        while (number>0)
        {
            value = value + (double) 1/number;
            number--;
            System.out.println(value);
        }
    }
}