package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOdd = false;
        int total = 0;
        while (!isOdd) {
            System.out.println("Tek sayı girene kadar döngü devam edecektir.");
            int n = scanner.nextInt();
            if (n % 2 != 0) {
                isOdd = true;
            }
            if (n % 2 == 0 && n % 4 == 0) {
                total = total + n;
            }
        }
        System.out.println("2 ve 4'ün katı olan sayıların toplamı : " + total);


    }
}


