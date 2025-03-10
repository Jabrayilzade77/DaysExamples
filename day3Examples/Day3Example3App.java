package day3Examples;

import java.util.Scanner;

public class Day3Example3App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();

        long lastOddB = (b % 2 == 0) ? (b - 1) : b;
        long countB = (lastOddB + 1) / 2;
        long sumB = countB * countB;

        long lastOddA = ((a - 1) % 2 == 0) ? (a - 2) : (a - 1);
        long countA = (lastOddA + 1) / 2;
        long sumA = countA * countA;

        System.out.println(sumB - sumA);
    }
}
