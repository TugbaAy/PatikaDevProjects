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

        double price, vatAmountForBiggerThan1000 = 0.18, vatAmountForSmallerThan1000 = 0.8;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün tutarını giriniz : ");
        price = input.nextDouble();


    }

}
