import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int num1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int num2 = input.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        int num3 = input.nextInt();

        // Küçükten büyüğe sıralama işlemi
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Sıralama: " + num1 + " <= " + num2 + " <= " + num3);
            } else {
                System.out.println("Sıralama: " + num1 + " <= " + num3 + " <= " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Sıralama: " + num2 + " <= " + num1 + " <= " + num3);
            } else {
                System.out.println("Sıralama: " + num2 + " <= " + num3 + " <= " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Sıralama: " + num3 + " <= " + num1 + " <= " + num2);
            } else {
                System.out.println("Sıralama: " + num3 + " <= " + num2 + " <= " + num1);
            }
        }
    }
}
