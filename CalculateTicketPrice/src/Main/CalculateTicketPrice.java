package Main;

import java.util.Scanner;

public class CalculateTicketPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int typeOfTravel = 0, distance, age = 0;
        double ageDiscount = 0, typeOfTravelDiscount, pricePerKM = 0.10, totalPrice = 0.0;
        boolean ageDis = false;
        System.out.println("Gidilecek mesafe \t ");
        distance = scanner.nextInt();
        if (distance < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Yaşınız \t ");
            age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Hatalı Veri Girdiniz !");
            } else {
                System.out.println("1 = Tek Yön\n2 = Gidiş Dönüş");
                System.out.println("Yolculuk Tipi\t ");

                typeOfTravel = scanner.nextInt();
                if (typeOfTravel != 1 && typeOfTravel != 2) {
                    System.out.println("Hatalı Veri Girdiniz !");
                } else {
                    System.out.println();
                    totalPrice = distance * pricePerKM;
                    System.out.println("Tutar \t  " + totalPrice + " TL\n");

                    if (age < 12) {
                        ageDis = true;
                        ageDiscount = totalPrice * 0.50;
                    } else if (age >= 12 && age < 24) {
                        ageDis = true;
                        ageDiscount = totalPrice * 0.10;
                    } else if (age > 65) {
                        ageDis = true;
                        ageDiscount = totalPrice * 0.30;
                    }

                    if (ageDis) {
                        totalPrice = totalPrice - ageDiscount;
                        System.out.println("Yaş İndirimi \t " + ageDiscount + " TL\n");
                    }

                    if (typeOfTravel == 2) {
                        typeOfTravelDiscount = totalPrice * 0.20;
                        totalPrice = totalPrice - typeOfTravelDiscount;
                        System.out.println("Gidiş Dönüş İndirimi \t" + typeOfTravelDiscount + " TL\n");
                        totalPrice = totalPrice * 2;
                    }

                    System.out.println("Toplam Ödenecek Tutar \t " + totalPrice + " TL");
                }
            }
        }


    }
}
