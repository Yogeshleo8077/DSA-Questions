import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void countFreq(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "programming";
        countFreq(str);
    }
}