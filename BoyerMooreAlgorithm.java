public class BoyerMooreAlgorithm {
    public static int boyerMooreAlgorithm(int arr[]) {
        int candidate = arr[0];
        int count = 1;

        for (int num : arr) {
            if (num == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = num;
                count = 1;
            }
        }

        // 2nd phase
        int freq = 0;

        for (int num : arr) {
            if (num == candidate) {
                freq++;
            }
        }

        if (freq > arr.length / 2) {
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 2, 3, 2, 2 };
        System.out.println(boyerMooreAlgorithm(arr));
    }
}