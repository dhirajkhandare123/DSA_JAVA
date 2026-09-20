/*

Given an integer array, find the contiguous subarray with the maximum sum containing only non-negative numbers.
If multiple subarrays have the same sum, choose the longest one.
If the length is also the same, choose the one with the smallest starting index.
If all elements are negative, return [-1].

 */


package Array;
import java.util.*;

public class Array_01 {

    public static ArrayList<Integer> findSubarray(int arr[]) {

        int maxSum = 0;
        int maxStart = -1, maxEnd = -1;

        int currSum = 0;
        int currStart = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {

                currSum = currSum + arr[i];

                int currLength = i - currStart + 1;
                int maxLength = (maxStart == -1)
                        ? 0
                        : maxEnd - maxStart + 1;

                if (currSum > maxSum ||
                        (currSum == maxSum && currLength > maxLength)) {

                    maxStart = currStart;
                    maxSum = currSum;
                    maxEnd = i;
                }

            } else {

                // Negative number -> start a new subarray
                currSum = 0;
                currStart = i + 1;
            }
        }

        // All elements were negative
        if (maxStart == -1) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(-1);
            return ans;
        }

        // Build the answer
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = maxStart; i <= maxEnd; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        // Manual input
        int arr[] = {1, 2, 5, -7, 2, 6};

        // Call function
        ArrayList<Integer> result = findSubarray(arr);

        // Print result
        System.out.println(result);
    }
}

