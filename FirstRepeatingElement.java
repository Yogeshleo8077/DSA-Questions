import java.util.LinkedHashMap;

public class FirstRepeatingElement {
    public static int firstRepeatingElement(int arr[]) {
        if (arr.length == 1) {
            return -1;
        }

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) >= 2) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };

        int result = firstRepeatingElement(arr);

        if (result != -1) {
            System.out.println("First Repeting Element is: " + result);
        } else {
            System.out.println("No Repeating Found: " + -1);
        }
    }
}