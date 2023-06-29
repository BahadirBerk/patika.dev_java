public class Main {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
        int targetNumber = 5;

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < targetNumber && numbers[i] > closestSmaller) {
                closestSmaller = numbers[i];
            }
            if (numbers[i] > targetNumber && numbers[i] < closestLarger) {
                closestLarger = numbers[i];
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }
}
