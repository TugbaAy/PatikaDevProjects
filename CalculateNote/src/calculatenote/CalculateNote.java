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

        int math = 0, physics = 0, chemistry = 0, turkish = 0, history = 0, music = 0;
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

        
        int totalPointOfLessons = math + physics + chemistry + turkish + history + music;
        double averageOfLessons = totalPointOfLessons / 6;
        System.out.println("Ders notu ortalamanız : " +averageOfLessons);
        
        String result = averageOfLessons >= 60 ? "Geçtiniz" : "Kaldınız." ;
        
        System.out.println("Ortalamanızın sonucu olarak derslerden : " +result );
        
    }

}
