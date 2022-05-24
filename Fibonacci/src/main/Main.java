package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Kaç Adet Fibonnacci Sayısı Görmek İstiyorsunuz?");
        int N = klavye.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum = firstNum + secondNum;

        System.out.println("Fibonacci Sayıları ");
        System.out.print(firstNum + " " + secondNum + " ");

        while (N > 0) {
            System.out.print(thirdNum + " ");
            N--;
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = firstNum + secondNum;
        }
    }

}
