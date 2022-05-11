package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        int num = scanner.nextInt();
        System.out.println("Üs sayısını giriniz.");
        int k = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < k; i++) {
            result = result * num;
        }

        System.out.println(num + "^" + k + " = " + result);
    }
}
