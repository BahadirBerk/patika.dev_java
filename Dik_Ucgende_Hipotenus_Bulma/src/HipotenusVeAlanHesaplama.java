import java.util.Scanner;

public class HipotenusVeAlanHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci dik kenar uzunluğunu girin: ");
        double a = scanner.nextDouble();
        System.out.print("İkinci dik kenar uzunluğunu girin: ");
        double b = scanner.nextDouble();

        // Hipotenüs hesaplaması
        double hipotenus = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs: " + hipotenus);
        // Üçgenin alanını hesaplama
        double u = (a + b + hipotenus) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - hipotenus));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
