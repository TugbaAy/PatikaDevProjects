package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üs sayısını giriniz.");
        int num = scanner.nextInt();
        int resFor4 = 1, resFor5 = 1;
        for (int i = 1; i < num; i++) {
            System.out.println(i + ".kuvvet\n4^" + i + " = " + (resFor4 = resFor4 * 4) + "\n" + "5^" + i + " = " + (resFor5 = resFor5 * 5));
        }
    }

}
