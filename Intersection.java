import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    public static List<Integer> findIntersection(int arr1[], int arr2[]) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        if (arr1.length == 0 || arr2.length == 0) {
            return list;
        }

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2 };
        int arr2[] = { 1, 2, 2 };

        System.out.println(findIntersection(arr1, arr2));
    }
}