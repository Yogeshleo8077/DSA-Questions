import java.util.HashMap;

public class AnagramsMapVersion {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(map, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch))
                return false;

            int freq = map.get(ch) - 1;
            if (freq == 0) {
                map.remove(ch);
            } else {
                map.put(ch, freq);
            }
        }

        // If all matched, map must be empty
        return map.isEmpty();

    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }
}