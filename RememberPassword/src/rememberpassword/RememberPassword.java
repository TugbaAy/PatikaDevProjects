package rememberpassword;

import java.util.Scanner;

public class RememberPassword {

    static String USERNAME = "patika";
    static String PASSWORD = "dev";

    public static void main(String[] args) {

        String username, password;

        Scanner input = new Scanner(System.in);
        System.out.println("Username : ");
        username = input.nextLine();
        System.out.println("Password : ");
        password = input.nextLine();

        boolean usernameControl = username.equals(USERNAME);
        boolean passControl = password.equals(PASSWORD);

        if (usernameControl && passControl) {
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
            if (usernameControl && !passControl) {
                System.out.println("Şifrenizi yenilemek ister misiniz ? ( Y/N || 0/1  => Y = 1 / N = 0)");
                String choice = input.nextLine();
                if (choice.equals("y") || choice.equals("Y") || choice.equals("1")) {
                    //update pass
                    System.out.println("Uygulamayı kullanmaya devam edeceğiniz şifrenizi giriniz : ");
                    String newPass = input.nextLine();
                    if (newPass.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        PASSWORD = newPass;
                        System.out.println("Şifreniz " + PASSWORD + " olarak güncellendi.");
                    }
                } else if (choice.equals("n") || choice.equals("N") || choice.equals("0")) {
                    System.out.println("Görüşmek üzere...");
                } else {
                    System.out.println("Geçersiz bir seçim yaptınız. İşlem sonlandırılıyor.");
                }
            }
        }

    }

}
