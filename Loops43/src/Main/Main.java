package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int num = reader.nextInt();
        int toplam = 0;

        while (num != 0) {
            toplam = (num % 10) + toplam;
            num /= 10;
        }

        System.out.println("Basamak Toplamı: " + toplam);
    }

}
