/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatecirclearea;

import java.util.Scanner;

/**
 *
 * @author tuggbaayy
 */
public class CalculateCircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int r = 10;
        double areaOfTheCircle, pi = 3.14, circumferencOfTheCircle, degree;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yarıçap giriniz : ");
        r = input.nextInt();

        System.out.println("Lütfen açı derecesi giriniz : ");
        degree = input.nextInt();

        System.out.println();
        
        System.out.println(r + " cm yarıçaplı dairenin çevresi\t" + (2 * pi * r) + "\n");
        System.out.println(r + " cm yarıçaplı dairenin alanı\t" + (2 * Math.pow(pi, 2)) + "\n");
        System.out.println(r + " cm yarıçaplı ve " + degree + " dereceli daire diliminin alanı\t" + ((pi * Math.pow(r, 2) * degree) / 360) + "\n");

    }

}
