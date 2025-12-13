import java.util.HashMap;

public class DuplicateCharactersString {
    public static void duplicateCharString(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (char key : freqMap.keySet()) {
            if (freqMap.get(key) >= 2) {
                System.out.print(key + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabbccdde";
        duplicateCharString(str);
    }
}