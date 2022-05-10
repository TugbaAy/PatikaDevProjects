package Main;

import java.util.Scanner;

public class CalculateZodiac {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz: ");
        int month = inp.nextInt();

        System.out.println("Doğduğunuz günü giriniz: ");
        int day = inp.nextInt();

        String zodiac = "";

        if ((day < 1 && day > 31) && (month < 1 && month > 12)) {
            System.out.println("Geçerli değerler giriniz.");
        } else {
            if (month == 1) {
                if (day <= 21)
                    zodiac = "Oğlak";
                else
                    zodiac = "Kova";
            } else if (month == 2) {
                if (day <= 19)
                    zodiac = "Kova";
                else
                    zodiac = "Balık";
            } else if (month == 3) {
                if (day <= 20)
                    zodiac = "Balık";
                else
                    zodiac = "Koç";
            } else if (month == 4) {
                if (day <= 20)
                    zodiac = "Koç";
                else
                    zodiac = "Boğa";
            } else if (month == 5) {
                if (day <= 21)
                    zodiac = "Boğa";
                else
                    zodiac = "İkizler";
            } else if (month == 6) {
                if (day <= 22)
                    zodiac = "İkizler";
                else
                    zodiac = "Yengeç";
            } else if (month == 7) {
                if (day <= 22)
                    zodiac = "Yengeç";
                else
                    zodiac = "Aslan";
            } else if (month == 8) {
                if (day <= 22)
                    zodiac = "Aslan";
                else
                    zodiac = "Başak";
            } else if (month == 9) {
                if (day <= 22)
                    zodiac = "Başak";
                else
                    zodiac = "Terazi";
            } else if (month == 10) {
                if (day <= 22)
                    zodiac = "Terazi";
                else
                    zodiac = "Akrep";
            } else if (month == 11) {
                if (day <= 21)
                    zodiac = "Akrep";
                else
                    zodiac = "Yay";
            } else {
                if (day <= 21)
                    zodiac = "Yay";
                else
                    zodiac = "Oğlak";
            }
        }

        System.out.println("Hesaplanan burcunuz  - " + zodiac + " - ");

    }

}
