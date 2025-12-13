import java.util.HashMap;
import java.util.Map;

public class countFrequencyOfaNumber {
    public static void countFreq(int arr[]) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : freqMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 2, 1, 54, 2 };
        countFreq(arr);
    }
}