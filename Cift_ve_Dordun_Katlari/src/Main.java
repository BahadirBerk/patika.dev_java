import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Bir sayı girin (Çıkış için 0 girin): ");
            number = scanner.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        } while (number != 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);
    }
}
