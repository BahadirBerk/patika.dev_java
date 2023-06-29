public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        double harmonicSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / numbers[i];
        }

        double harmonicMean = numbers.length / harmonicSum;

        System.out.println("Dizinin Harmonik Ortalaması: " + harmonicMean);
    }
}
