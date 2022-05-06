package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Öncelikle işlem yapacağınız sayılar, ardından yapılacak işlem seçilecektir.");
        System.out.println("İşlem yapılacak : ");
        System.out.println("1. Sayı : ");
        int n = input.nextInt();
        System.out.println("2. Sayı : ");
        int k = input.nextInt();

        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        System.out.println("Seçiminiz : ");
        int choice = input.nextInt();

        int result = 0;
        String option = "";

        if (n < 0 || k < 0) {
            System.out.println("Geçeriz rakam girdiniz. Lütfen tekrar deneyiniz.");
            choice = 5;
        }

        switch (choice) {
            case 1:
                result = n + k;
                option = "+";
                System.out.println(n + " " + option + " " + k + " = " + result);
                break;
            case 2:
                result = n - k;
                option = "-";
                System.out.println(n + " " + option + " " + k + " = " + result);
                break;
            case 3:
                result = n * k;
                option = "*";
                System.out.println(n + " " + option + " " + k + " = " + result);
                break;
            case 4:
                result = n / k;
                option = "/";
                System.out.println(n + " " + option + " " + k + " = " + result);
                break;
            default:
                System.out.println("Tanımlı olmayan bir işlem seçtiniz.");
        }

    }
}
