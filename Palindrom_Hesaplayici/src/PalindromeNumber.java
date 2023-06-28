import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " bir palindromik sayı :')");
        } else {
            System.out.println(number + " bir palindromik sayı değil :/ ");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
