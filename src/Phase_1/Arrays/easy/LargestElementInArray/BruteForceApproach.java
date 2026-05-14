package Phase_1.Arrays.easy.LargestElementInArray;

import java.util.Arrays;

class BruteForceApproach {
    public static int sortArr(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}

/*

> **Time Complexity: O(N log N)** where N is the size of the array, as we are sorting the array.
>
>
> **Space Complexity: O(1)** as we are using a constant
>
 */