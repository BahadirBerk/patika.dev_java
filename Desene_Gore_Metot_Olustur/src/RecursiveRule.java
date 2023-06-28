import java.util.Scanner;

public class RecursiveRule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();

        recursiveRule(n);
    }

    static void recursiveRule(int n) {
        System.out.println(n);

        if (n <= 0) {
            return;
        }

        recursiveRule(n - 5);
        System.out.println(n);
    }
}
