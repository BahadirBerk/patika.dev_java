import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 6, 8, 2, 9, 4, 3, 8, 6, 10, 12, 10};

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                if (countMap.containsKey(number)) {
                    int count = countMap.get(number);
                    countMap.put(number, count + 1);
                } else {
                    countMap.put(number, 1);
                }
            }
        }

        System.out.println("Tekrar Eden Cift Sayilar:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                System.out.println(number);
            }
        }
    }
}
