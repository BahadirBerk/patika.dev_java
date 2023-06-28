import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapılacak İşlemi Seçiniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                // İki sayının toplamını hesapla ve ekrana yazdır
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                // İki sayının farkını hesapla ve ekrana yazdır
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                // İki sayının çarpımını hesapla ve ekrana yazdır
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    // İki sayının bölümünü hesapla ve ekrana yazdır
                    System.out.println("Bölüm: " + (n1 / n2));
                } else {
                    // Sıfıra bölme hatası durumunda özel bir mesaj ekrana yazdır
                    System.out.println("Bir sayıyı sıfıra bölemezsiniz!");
                }
                break;
            default:
                // Geçersiz bir seçim yapıldığında hata mesajı ekrana yazdır
                System.out.println("Hatalı seçim yaptınız. Lütfen tekrar deneyin.");
        }
    }
}
