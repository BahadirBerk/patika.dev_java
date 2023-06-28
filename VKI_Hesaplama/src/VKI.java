import java.util.Scanner;

public class VKI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuzu (kg) girin: ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuzu (metre cinsinden) girin: ");
        double boy = scanner.nextDouble();

        // Vücut Kitle İndeksi
        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksi: " + vki);
    }
}
