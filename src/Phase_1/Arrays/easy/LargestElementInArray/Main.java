package Phase_1.Arrays.easy.LargestElementInArray;

public class Main {
    public static void main(String[] args) {
        // Brute Force Approach
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};

        // Find and output the largest element in both arrays
        System.out.println("The Largest element in the array is: " + BruteForceApproach.sortArr(arr1));
        System.out.println("The Largest element in the array is: " + BruteForceApproach.sortArr(arr2));

        // OptimalApproach
        // Array 1
        int[] arr3 = {2, 5, 1, 3, 0};
        int n = arr3.length;  // Size of the array
        int max = OptimalApproach.findLargestElement(arr3, n);  // Call the function to find the largest element
        System.out.println("The largest element in the array is: " + max);  // Output the result

        // Array 2
        int[] arr4 = {8, 10, 5, 7, 9};
        n = arr2.length;  // Size of the array
        max = OptimalApproach.findLargestElement(arr4, n);  // Call the function to find the largest element
        System.out.println("The largest element in the array is: " + max);  // Output the result


    }
}
