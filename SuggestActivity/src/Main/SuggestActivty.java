package Main;

import java.util.Scanner;

public class SuggestActivty {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz : ");
        int degree = inp.nextInt();

        if (degree < 5) {
            System.out.println("Kayak yapmaya uygun bir derece.");
        } else if (degree >= 5 && degree <= 15) {
            System.out.println("Sinemaya gitmeye uygun bir derece.");
        } else if (degree >= 15 && degree <= 25) {
            System.out.println("Piknik yapmaya uygun bir derece.");
        } else if (degree > 25) {
            System.out.println("Yüzmeye uygun bir derece.");
        }

    }

}
