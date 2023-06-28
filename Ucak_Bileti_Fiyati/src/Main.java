import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int travelType = scanner.nextInt();

        double basePrice = distance * 0.10;
        double totalPrice = basePrice;

        // Input validation
        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        // Apply age discounts
        if (age < 12) {
            totalPrice -= totalPrice * 0.50; // %50 indirim
        } else if (age <= 24) {
            totalPrice -= totalPrice * 0.10; // %10 indirim
        } else if (age >= 65) {
            totalPrice -= totalPrice * 0.30; // %30 indirim
        }

        // Apply travel type discount
        if (travelType == 2) {
            totalPrice -= totalPrice * 0.20; // %20 indirim
        }

        System.out.println("Toplam Tutar = " + totalPrice + " TL");
    }
}
