public class RotateArray {
    public static void rotateByK(int arr[], int k) {
        int n = arr.length;
        // handle k
        k = k % n;

        reverse(arr, 0, n - 1); // rotate entire array
        reverse(arr, 0, k - 1); // rotate first k elements
        reverse(arr, k, n - 1); // rotate rest k elements
    }

    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        rotateByK(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
