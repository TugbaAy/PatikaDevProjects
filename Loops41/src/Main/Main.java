package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eleman Sayısı (n) sayısını giriniz.");
        int N = scanner.nextInt();

        System.out.println("Seçim Sayısı (r) sayısını giriniz.");
        int R = scanner.nextInt();

        int facForN = 1;
        int facForR = 1;
        int facForNMinusR = 1;

        // Kombinasyon : C(n,r) = n! / (r! * (n-r)!)


        for (int i = 1; i <= N; i++) {
            facForN = facForN * i;
        }
        System.out.println();
        System.out.println("1.İşlem");
        System.out.println("n! = " + facForN + "\n");

        for (int i = 1; i <= R; i++) {
            facForR = facForR * i;
        }
        System.out.println("2.İşlem");
        System.out.println("r! = " + facForR + "\n");

        int minus = N - R;
        for (int i = 1; i < minus; i++) {
            facForNMinusR = facForNMinusR = i;
        }

        System.out.println("3.İşlem");
        System.out.println("(n-r)! = " + facForNMinusR + "\n");

        System.out.println("4.İşlem");
        System.out.println("(r! * (n-r)!) = " + (facForR * facForNMinusR) + "\n");

        int combination = facForN / (facForR * facForNMinusR);
        System.out.println("C(n,r) = n! / (r! * (n-r)!)");
        System.out.println("C(" + N + ", " + R + ")! = " + combination);
    }

}
