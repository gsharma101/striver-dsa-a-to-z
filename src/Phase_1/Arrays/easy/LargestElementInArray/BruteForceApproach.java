package Phase_1.Arrays.easy.LargestElementInArray;

import java.util.Arrays;

class BruteForceApproach {
    public static int sortArr(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}