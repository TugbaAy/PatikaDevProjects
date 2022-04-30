/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassındex;

import java.util.Scanner;

/**
 *
 * @author tuggbaayy
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double kg, m;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu kg cinsinden giriniz : ");
        kg = input.nextDouble();

        System.out.println("Lütfen boyunuzu m cinsinden giriniz(örn; 1,72) : ");
        m = input.nextDouble();

        System.out.println("Vücut Kitle İndeksiniz : " + (kg / (m * m)));

    }

}
