package Main;

import java.util.Scanner;

public class CalculateAverageOfLessons {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int math, turkish, chemistry, music, physic;

        System.out.println("Matematik notunuzu giriniz : ");
        math = input.nextInt();
        if (math < 0 || math > 100) math = 0;

        System.out.println("Türkçe notunuzu giriniz : ");
        turkish = input.nextInt();
        if (turkish < 0 || turkish > 100) math = 0;

        System.out.println("Kimya notunuzu giriniz : ");
        chemistry = input.nextInt();
        if (turkish < 0 || turkish > 100) turkish = 0;

        System.out.println("Müzik notunuzu giriniz : ");
        music = input.nextInt();
        if (music < 0 || music > 100) music = 0;


        System.out.println("Fizik notunuzu giriniz : ");
        physic = input.nextInt();
        if (physic < 0 || physic > 100) physic = 0;

        double average;

        if (math == 0 && physic == 0 && music == 0 && chemistry == 0 && turkish == 0) {
            average = 0;
        } else {
            average = (math + turkish + chemistry + music + physic) / 5;
        }

        System.out.println("Ders ortalamanız " + average);

    }

}
