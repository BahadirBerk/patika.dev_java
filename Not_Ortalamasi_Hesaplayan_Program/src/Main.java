import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik sınavı puanınızı girin: ");
        int matematik = scanner.nextInt();
        System.out.print("Fizik sınavı puanınızı girin: ");
        int fizik = scanner.nextInt();
        System.out.print("Kimya sınavı puanınızı girin: ");
        int kimya = scanner.nextInt();
        System.out.print("Türkçe sınavı puanınızı girin: ");
        int turkce = scanner.nextInt();
        System.out.print("Tarih sınavı puanınızı girin: ");
        int tarih = scanner.nextInt();
        System.out.print("Müzik sınavı puanınızı girin: ");
        int muzik = scanner.nextInt();
        int toplamPuan = matematik + fizik + kimya + turkce + tarih + muzik;
        double ortalama = (double)toplamPuan / 6.0;
        String durum = ortalama > 60.0 ? "Sınıfı Geçtiniz :')" : "Sınıfta Kaldınız :/";
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println(durum);
        scanner.close();
    }
}
