import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int taban = scan.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scan.nextInt();

        int sonuc = recursivePower(taban, us);

        System.out.println("Sonuç: " + sonuc);
    }

    static int recursivePower(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * recursivePower(taban, us - 1);
        }
    }
}
