package day3Examples;

import java.util.Scanner;

public class Day3Example2App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;

        while (n > 0) {
            int temp = n;
            temp %= 2;
            if (temp == 1) {
                count++;
            }
            n /= 2;
        }
        System.out.println(count);
    }
}
