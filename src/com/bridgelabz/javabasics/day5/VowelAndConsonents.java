package com.bridgelabz.javabasics.day5;

import java.util.Scanner;

public class VowelAndConsonents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        char letter = scanner.next().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
        {
            System.out.println("Entered Character is a Vowel ");
        }
        else
        {
            System.out.println("Enter Character is a Consonant ");
        }
    }
}

