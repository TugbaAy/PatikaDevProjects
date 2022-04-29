/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taximeter;

import java.util.Scanner;

/**
 *
 * @author tuggbaayy
 */
public class Taximeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int startingPrice = 10, theWayTraveled;
        double totalPrice;
        double perKMPrice = 2.20;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen gidilen yolu km cinsinden belirtiniz. : ");
        theWayTraveled = input.nextInt();

        if (theWayTraveled <= 0) {
            System.out.println("Girilen değer 0 ve 0'dan küçük olamaz.");
        } else {
            totalPrice = startingPrice + (theWayTraveled * perKMPrice);
            if (totalPrice < 20) {
                System.out.println("Ödenecek toplam tutar : 20");
            } else {
                System.out.println("Ödenecek toplam tutar : " + totalPrice);
            }
        }
    }

}
