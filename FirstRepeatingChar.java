import java.util.LinkedHashSet;

public class FirstRepeatingChar {
    public static int firstRepeatingChar(int arr[]) {
        if (arr.length == 1) {
            return -1;
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return num;
            }

            set.add(num);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 5, 3, 6 };
        int result = firstRepeatingChar(arr);

        if (result != -1) {
            System.out.println("First Repeating Character is: " + result);
        } else {
            System.out.println("No Repeating Character Found: " + -1);
        }
    }
}