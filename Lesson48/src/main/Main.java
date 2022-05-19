package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz?");
        int N = input.nextInt();
        boolean isEqualToZero = false;
        int bigger = 0;
        int smallest = 0;
        int count = 0;

        while (!isEqualToZero) {
            System.out.println("Sayıyı giriniz: ");
            int num = input.nextInt();
            System.out.println();
            int temp = num;

            if (count == 0) {
                smallest = temp;
                bigger = temp;
            } else {
                if (temp > bigger) {
                    bigger = temp;
                }

                if (temp < smallest) {
                    smallest = temp;
                }
            }


            count++;

            if (count == N) {
                isEqualToZero = true;
                System.out.println("En büyük sayı : " + bigger + "\n");
                System.out.println("En küçük sayı : " + smallest + "\n");
            }
        }


    }
}
