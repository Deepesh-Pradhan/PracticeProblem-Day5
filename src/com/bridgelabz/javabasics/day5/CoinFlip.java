package com.bridgelabz.javabasics.day5;

public class CoinFlip {
    public static void main(String[] args) {
        int headCount = 0;
        int tailCount =0;
        int number = 5;
        for (int i=1; i<5; i++) {
            double value = Math.random();
            if (value <= .5) {
                tailCount++;
            } else {
                headCount++;
            }
        }
        int persentageTailCount = tailCount * 100 / number;
        int persentageHeadCount = headCount * 100 / number;
        System.out.println("Persentage of Tailcount is : " +persentageTailCount+ "%");
        System.out.println("Persentage of Headcount is : " +persentageHeadCount+ "%");
    }

}
