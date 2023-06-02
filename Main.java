import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        // Linear Search
        long startTime = System.currentTimeMillis();
        int linearSearchResult = linearSearch(array, target);
        long endTime = System.currentTimeMillis();

        System.out.println("Linear Search:");
        if (linearSearchResult == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + linearSearchResult);
        }
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");

        // Binary Search
        startTime = System.currentTimeMillis();
        int binarySearchResult = binarySearch(array, target);
        endTime = System.currentTimeMillis();

        System.out.println("\nBinary Search:");
        if (binarySearchResult == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + binarySearchResult);
        }
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
