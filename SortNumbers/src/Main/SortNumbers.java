package Main;

import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz :");
        int num1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        int num2 = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz :");
        int num3 = scanner.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            if (num2 > num3) {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            } else {
                System.out.println(num1 + " > " + num3 + " > " + num2);
            }
        } else if ((num2 > num1) && (num2 > num3)) {
            if (num1 > num3) {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            } else {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }
        } else {
            if (num1 > num2) {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            } else {
                System.out.println(num3 + " > " + num2 + " > " + num1);
            }
        }


    }

}
