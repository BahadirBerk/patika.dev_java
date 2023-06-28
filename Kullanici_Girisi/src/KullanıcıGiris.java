import java.util.Scanner;

public class KullanıcıGiris {
    public static void main(String[] args) {
        String correctPassword = "123456"; // Doğru şifre

        Scanner input = new Scanner(System.in);

        System.out.print("Şifrenizi giriniz: ");
        String password = input.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String resetChoice = input.nextLine();

            if (resetChoice.equalsIgnoreCase("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = input.nextLine();

                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Giriş başarısız. Şifre sıfırlama talebiniz reddedildi.");
            }
        }
    }
}
