import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " bir palindromik kelimedir.");
        } else {
            System.out.println(word + " bir palindromik kelime değildir.");
        }
    }

    public static boolean isPalindrome(String word) {
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        return word.equalsIgnoreCase(reversedWord);
    }
}
