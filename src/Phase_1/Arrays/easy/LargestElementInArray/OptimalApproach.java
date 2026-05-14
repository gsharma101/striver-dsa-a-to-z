package Phase_1.Arrays.easy.LargestElementInArray;

public class OptimalApproach {
    public static int findLargestElement(int[] arr, int n) {
        int max = arr[0];  // Initialize max with the first element in the array

        // Iterate through the array to find the maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {  // If the current element is greater than max, update max
                max = arr[i];
            }
        }

        return max;  // Return the largest element found
    }
}


/*
 **Time Complexity: O(N)** where N is the size of the array, as we are iterating through the array once.

 **Space Complexity: O(1)** as we are using a constant
 */
