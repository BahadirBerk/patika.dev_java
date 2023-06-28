import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        // İlk iki elemanı 0 ve 1 olan Fibonacci serisi
        int fib1 = 0, fib2 = 1;

        System.out.print("Fibonacci serisi: ");

        // Fibonacci serisini hesapla ve ekrana yazdır
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fib1 + " ");

            int fibSonraki = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibSonraki;
        }

        scanner.close();
    }
}
