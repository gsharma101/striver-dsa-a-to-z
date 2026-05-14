package Phase_1.Arrays.easy.LargestElementInArray;

public class Main {
    public static void main(String[] args) {
        // Initialize arrays
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};

        // Find and output the largest element in both arrays
        System.out.println("The Largest element in the array is: " + BruteForceApproach.sortArr(arr1));
        System.out.println("The Largest element in the array is: " + BruteForceApproach.sortArr(arr2));
    }
}
