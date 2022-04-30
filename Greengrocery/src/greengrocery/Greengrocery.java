/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greengrocery;

import java.util.Scanner;

/**
 *
 * @author tuggbaayy
 */
public class Greengrocery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */
        double tomatoPerKG = 1.11,
                bananaPerKG = 0.95,
                applePerKG = 3.64,
                pearPerKG = 2.14,
                eggplantPerKG = 5.00;

        double tomato, banana, apple, pear, eggplant;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen alışveriş yaptığınız ürünleri kg cinsinden giriniz.");

        System.out.println("Domates: ");
        tomato = input.nextDouble();

        System.out.println("Patlıcan: ");
        eggplant = input.nextDouble();

        System.out.println("Elma: ");
        apple = input.nextDouble();

        System.out.println("Armut: ");
        pear = input.nextDouble();

        System.out.println("Muz: ");
        banana = input.nextDouble();

        System.out.println("Fişiniz hazırlanıyor...");
        System.out.println("");
        System.out.println("Domates   \t" + (tomato * tomatoPerKG));
        System.out.println("Patlıcan  \t" + (eggplant * eggplantPerKG));
        System.out.println("Elma      \t" + (apple * applePerKG));
        System.out.println("Armut     \t" + (pear * pearPerKG));
        System.out.println("Muz       \t" + (banana * bananaPerKG));

        System.out.println("");
        System.out.println("Toplam Ödenecek Tutar : "
                + ((tomato * tomatoPerKG)
                + (eggplant * eggplantPerKG)
                + (apple * applePerKG)
                + (pear * pearPerKG)
                + (banana * bananaPerKG)));

    }

}
