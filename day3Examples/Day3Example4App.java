package day3Examples;

import java.util.Scanner;

public class Day3Example4App {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
//        int faktorial = 1;
//
//        while (n > 0) {
//            faktorial *= n;
//            n--;
//        }
//        System.out.println(faktorial);

        Scanner scanner = new Scanner(System.in);
        String encrypted = scanner.nextLine();
        char[] chars = encrypted.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - 1);
        }

        System.out.println(new String(chars));

    }
}
