package BinarySearch;
//it is a bad code

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                idx = mid;
                break;
            }
            else if (arr[mid] <= arr[high]) {
                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            } else {
                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;

            }

        }

        System.out.println(idx);
    }
}
