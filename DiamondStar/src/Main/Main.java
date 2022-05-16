package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int uzunluk = klavye.nextInt();

        int m = 1;
        int n;

        do {
            n = 1;
            do {
                System.out.print(" ");
            }
            while (++n <= uzunluk - m + 1);

            n = 1;
            do {
                System.out.print("*");
            }
            while (++n <= m * 2 - 1);
            System.out.println();
        }

        while (++m <= uzunluk);
        m = uzunluk - 1;

        do {
            n = 1;
            do {
                System.out.print(" ");
            } while (++n <= uzunluk - m + 1);

            n = 1;
            do {
                System.out.print("*");

            } while (++n <= m * 2 - 1);
            System.out.println();
        }
        while (--m > 0);

    }
}
