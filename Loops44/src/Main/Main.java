package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısını giriniz :");

        int num = inp.nextInt();
        double res = 0;

        for (int i = 1; i < num; i++) {
            res = res + (1 / i);
        }

        System.out.println("Harmonik toplam = " + res);

    }

}
