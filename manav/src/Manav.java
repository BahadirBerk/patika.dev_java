import java.util.HashMap;
import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> urunler = new HashMap<>();

        // Ürünlerin kilogram fiyatları
        urunler.put("Armut", 2.14);
        urunler.put("Elma", 3.67);
        urunler.put("Domates", 1.11);
        urunler.put("Muz", 0.95);
        urunler.put("Patlıcan", 5.00);

        double toplamTutar = 0.0;

        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = scanner.nextDouble();
        toplamTutar += armutKilo * urunler.get("Armut");

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = scanner.nextDouble();
        toplamTutar += elmaKilo * urunler.get("Elma");

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = scanner.nextDouble();
        toplamTutar += domatesKilo * urunler.get("Domates");

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = scanner.nextDouble();
        toplamTutar += muzKilo * urunler.get("Muz");

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = scanner.nextDouble();
        toplamTutar += patlicanKilo * urunler.get("Patlıcan");

        System.out.println("Toplam Tutar: " + toplamTutar + " ₺");
    }
}
