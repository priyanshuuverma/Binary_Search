// Medium
// Topics
// premium lock icon
// Companies
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.


class Solution {
    public int upperBound(int[] nums, int n , int target){
        int low = 0, high = n-1, ans = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] > target){
                ans = mid;
                high = mid-1;   // ✅ move left
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public int lowerBound(int[] nums, int n , int target){
        int low = 0, high = n-1, ans = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid-1;   // ✅ move left
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int lb = lowerBound(nums, nums.length, target);
        if(lb == nums.length || nums[lb] != target){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        ans[0] = lb;
        ans[1] = upperBound(nums, nums.length, target) - 1; // ✅ subtract 1
        return ans;
    }
}
