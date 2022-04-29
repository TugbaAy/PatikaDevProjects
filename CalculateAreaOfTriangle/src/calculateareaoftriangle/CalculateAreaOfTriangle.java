/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateareaoftriangle;

import java.util.Scanner;

/**
 *
 * @author tuggbaayy
 */
public class CalculateAreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a, b;
        double c;
        Scanner input = new Scanner(System.in);

        System.out.println("A kenarı uzunluğunu giriniz : ");
        a = input.nextInt();

        System.out.println("B kenarı uzunluğunu giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hesaplanan hipotenüs : " + c + " cm");

        double perimeterOfTriangle = (a + b + c) / 2;

        System.out.println("Üçgenin çevresi : " + perimeterOfTriangle + " cm");

        double areaOfTriangle = Math.sqrt(
                perimeterOfTriangle
                * (perimeterOfTriangle - a)
                * (perimeterOfTriangle - b)
                * (perimeterOfTriangle - c)
        );

        System.out.println("Üçgenin alanı : " + areaOfTriangle + " cm");
    }

}
