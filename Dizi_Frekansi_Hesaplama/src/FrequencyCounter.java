import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        // Frekansları hesaplamak için bir HashMap kullanılabilir
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Dizideki elemanları dolaşarak frekansları güncelle
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                // Eleman zaten map'te varsa frekansı bir artır
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // Eleman map'te yoksa frekansı 1 olarak başlat
                frequencyMap.put(num, 1);
            }
        }

        // Frekansları ekrana yazdır
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(num + " sayısı " + frequency + " kere tekrar edildi.");
        }
    }
}
