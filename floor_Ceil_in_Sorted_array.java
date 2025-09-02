// Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
// Output: 1

// Explanation: Largest number less than or equal to 5 is 2, whose index is 1.

class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int ans = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] <= x){
                ans = mid;
                low = mid + 1;
            } else{
                high = mid -1;
            }
        }
        return ans;
    }
}







// Ceil The Floor
// Difficulty: EasyAccuracy: 43.76%Submissions: 187K+Points: 2
// Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].

// Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
// Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].

// Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.

// Examples:

// Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
// Output: 6, 8
// Explanation: Floor of 7 is 6 and ceil of 7 is 8.







