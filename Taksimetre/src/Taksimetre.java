import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi (KM) girin: ");
        double mesafe = scanner.nextDouble();

        // Taksimetre tutarını hesaplama
        double acilisUcreti = 10.0;
        double kmBasinaUcret = 2.20;
        double odenecekTutar = acilisUcreti + (mesafe * kmBasinaUcret);

        // Minimum ödenecek tutarı kontrol etme
        if (odenecekTutar < 20.0) {
            odenecekTutar = 20.0;
        }

        System.out.println("Taksimetre Tutarı: " + odenecekTutar + " TL");
    }
}
