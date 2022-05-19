package main;

import java.util.Scanner;

public class Lesson46 {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Yatırılacak para miktarı : ");
                        int price = input.nextInt();
                        System.out.println("Hesabınıza " + price + " TL para yatırılmıştır.");
                        balance += price;
                        System.out.println("Bakiyeniz : " + balance + " TL olarak güncellenmiştir.");
                        break;
                    case 2:
                        System.out.print("Çekilecek para miktarı : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            System.out.println("Hesabınızdan " + price + " TL para çekilmiştir.");
                            balance -= price;
                        }
                        System.out.println("Bakiyeniz : " + balance + " TL olarak güncellenmiştir.");
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance + " TL");
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    default:
                        System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyiniz.");
                        break;
                }
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
