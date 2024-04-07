Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
  
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the sorted arrays
        int[] mergedArray = mergeArrays(nums1, nums2);
        // Find the median of the merged array
        int mergedLength = mergedArray.length;
        if (mergedLength % 2 == 0) {
            // If length is even, average the two middle elements
            int midIndex1 = mergedLength / 2 - 1;
            int midIndex2 = mergedLength / 2;
            return (mergedArray[midIndex1] + mergedArray[midIndex2]) / 2.0;
        } else {
            // If length is odd, return the middle element
            int midIndex = mergedLength / 2;
            return mergedArray[midIndex];
        }
    }
    // Method to merge two sorted arrays
    private int[] mergeArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        // Merge the arrays while maintaining the sorted order
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }    
        // Add remaining elements from nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        // Add remaining elements from nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        return merged;
    }
}
  
