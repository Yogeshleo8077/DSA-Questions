import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int arr[]) {
        if (arr.length == 1) {
            return -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > arr.length / 2) {
                System.out.println("Majority Element: " + e.getKey());
                System.out.println("Frequecy: " + e.getValue());
                return e.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 2, 3, 2, 2 };

        System.out.println("Majority element is: " + majorityElement(arr));
    }
}