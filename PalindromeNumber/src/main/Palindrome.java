package main;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz. ");
        int N = sc.nextInt();

        int tempNum = N, reverseNum = 0, lastNum;

        while (tempNum != 0) {
            lastNum = tempNum % 10;
            reverseNum = reverseNum * 10 + lastNum;
            tempNum = tempNum / 10;
        }

        System.out.println(reverseNum == N ? N + " sayısı palindrom sayıdır." : N + " sayısı palindrom sayı değildir.");

    }
}
