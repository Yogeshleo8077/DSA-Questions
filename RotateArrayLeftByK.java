public class RotateArrayLeftByK {
    public static void rotateByK(int arr[], int k) {
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, k - 1); // rotate first k element
        reverse(arr, k, n - 1); // rotate rest k element
        reverse(arr, 0, n - 1); // rotate entire element

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

        rotateByK(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
