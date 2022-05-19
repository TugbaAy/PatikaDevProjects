package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz :");
        int n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int n2 = input.nextInt();

        int ebob = 1;

        int smaller, bigger;

        if (n1 > n2) {
            smaller = n2;
            bigger = n1;
        } else {
            smaller = n1;
            bigger = n2;
        }


        int i = smaller;
        while (i >= 1) {
            if (smaller % i == 0 && bigger % i == 0) {
                ebob = i;
                System.out.println("EBOB : " + ebob);
                break;
            }
            i--;
        }

        System.out.println("EKOK : " + ((n1 * n2) / ebob));
    }
}
