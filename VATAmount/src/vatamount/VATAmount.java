/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vatamount;

import java.util.Scanner;

/**
 *
 * @author tuggbaayy
 */
public class VATAmount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        KDV Tutarı Hesaplayan Program 
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        double price, vatAmountForBiggerThan1000 = 0.18, vatAmountForSmallerThan1000 = 0.08;
        double VAT_total_amount;
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün tutarını giriniz : ");
        price = input.nextDouble();

        if (price <= 0) {
            System.out.println("0'dan büyük bir tutar giriniz.");
        } else {
            System.out.println("Ürüne uygulanacak KDV tutarı hesaplanıyor... ");
            System.out.println("KDVsiz Fiyat " + price );
            if (price > 0 && price <= 1000) {
                System.out.println("Uygulanan KDV Oranı - % " + (vatAmountForSmallerThan1000*100));

                VAT_total_amount = price * vatAmountForSmallerThan1000;

                System.out.println("Uygulanan KDV Fiyatı " + VAT_total_amount);

                System.out.println("KDVli Fiyat " + (price + VAT_total_amount));
            } else {
                System.out.println("Uygulanan KDV Oranı - % " + (vatAmountForBiggerThan1000*100));

                VAT_total_amount = price * vatAmountForBiggerThan1000;

                System.out.println("Uygulanan KDV Fiyatı " + VAT_total_amount);

                System.out.println("KDVli Fiyat " + (price + VAT_total_amount));
            }
        }

    }

}
