import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = input.nextInt();

        int ebob = calculateEBOB(num1, num2);
        int ekok = calculateEKOK(num1, num2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }

    public static int calculateEBOB(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int calculateEKOK(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int i = max;

        while (true) {
            if (i % min == 0 && i % max == 0) {
                return i;
            }
            i++;
        }
    }
}
