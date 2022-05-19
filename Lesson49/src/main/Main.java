package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 28 = 1 + 2 + 4 + 7 + 14

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz ");
        int N = input.nextInt();

        int toplam = 1;

        for (int i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                toplam = toplam + i;
            }
        }

        if (toplam == N) {
            System.out.println(N + " Mükemmel sayıdır.");
        } else {
            System.out.println(N + " Mükemmel sayı değildir.");
        }

    }
}
