package Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12, 8, 41, 37, 49, 48, 16, 21, 28};
        int n = arr.length;
        int[] ans = new int[n];

        // Variable to track the maximum element to the right
        int max = -1;

        // Iterate from right to left (this helps propagate the largest value)
        for (int p = n - 1; p >= 0; p--) {
            // Update the answer for the current element
            ans[p] = max;

            // Update the max value if the current element is greater
            if (arr[p] > max) {
                max = arr[p];
            }
        }

        // Print the result array
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}