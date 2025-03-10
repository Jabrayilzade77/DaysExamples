package day3Examples;

import java.util.Scanner;

public class Day3Example1App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;
        while (n > 0) {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            n -= sum;
            count++;

        }
        System.out.println(count);
    }
}
