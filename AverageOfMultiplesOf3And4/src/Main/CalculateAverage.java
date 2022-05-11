package Main;

import java.util.Scanner;

public class CalculateAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int count = scanner.nextInt(), howManyNum = 0;
        System.out.println();
        double average = 0, total = 0;
        System.out.println("3 ve 4'e tam bölünen sayılar");
        for (int i = 0; i < count; i++) {
            if (i == 0) continue;
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                total = total + i;
                howManyNum++;
            }
        }

        System.out.println("3 ve 4'e tam bölünen sayıların toplamı : " + total);
        System.out.println("Ortalama " + (total / howManyNum));

    }
}
