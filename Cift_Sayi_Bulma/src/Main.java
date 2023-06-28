import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        int sum = 0; // Toplamı tutmak için değişken
        int count = 0; // 3 ve 4'e tam bölünen sayıların adedini tutmak için değişken

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) { // Çift sayıları kontrol et
                if (i % 3 == 0 && i % 4 == 0) { // 3 ve 4'e tam bölünenleri kontrol et
                    sum += i; // Toplamı güncelle
                    count++; // Adedi güncelle
                }
            }
        }

        double average = (double) sum / count; // Ortalamayı hesapla

        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
    }
}