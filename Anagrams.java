public class Anagrams {
    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int freqCount[] = new int[26];

        for (char ch : str1.toCharArray()) {
            freqCount[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            freqCount[ch - 'a']--;
        }

        for (int num : freqCount) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listan";
        String str2 = "silent";

        System.out.println(checkAnagrams(str1, str2));
    }
}