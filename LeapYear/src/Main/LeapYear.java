package Main;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz");
        int year = input.nextInt();

        boolean isLeapYear = true;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
                else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if (isLeapYear)
            System.out.println(year + " artık yıldır.");
        else
            System.out.println(year + " artık yıl değildir.");

    }
}
