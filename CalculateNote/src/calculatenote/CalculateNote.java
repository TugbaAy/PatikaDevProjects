/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatenote;

import java.util.Scanner;

/**
 *
 * @author tuggbaayy
 */
public class CalculateNote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int math, physics, chemistry, turkish, history, music;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        math = input.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        physics = input.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        physics = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        physics = input.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        physics = input.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        physics = input.nextInt();

    }

}
