import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int birthYear = scanner.nextInt();

        // Çin Zodyağı hesaplaması
        int zodiacIndex = birthYear % 12;

        // Çin Zodyağı burçlarını temsil eden diziler
        String[] zodiacSigns = {
                "Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"
        };

        // Çin Zodyağı burcunu ekrana yazdırma
        System.out.println("Çin Zodyağı Burcunuz: " + zodiacSigns[zodiacIndex]);
    }
}
