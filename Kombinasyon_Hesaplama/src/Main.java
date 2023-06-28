import java.util.Scanner;

public class Main {
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int combination(int n, int r) {
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n - r);
        int result = numerator / denominator;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n sayısını girin: ");
        int n = scanner.nextInt();

        System.out.print("r sayısını girin: ");
        int r = scanner.nextInt();

        int result = combination(n, r);

        System.out.println("C(" + n + ", " + r + ") = " + result);
    }
}
