import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        boolean asal = isPrime(sayi);
        if (asal) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }
    static boolean isPrime(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        return isPrimeRecursive(sayi, sayi / 2);
    }
    static boolean isPrimeRecursive(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return isPrimeRecursive(sayi, bolen - 1);
    }
}
