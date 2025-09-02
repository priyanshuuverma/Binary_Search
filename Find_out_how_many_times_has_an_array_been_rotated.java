// Input: arr[] = [15, 18, 2, 3, 6, 12]
// Output: 2
// Explanation: 
// Original sorted array = [2, 3, 6, 12, 15, 18]
// After 2 right rotations → [15, 18, 2, 3, 6, 12]  

// first we will find the lowest element and then will return its index as 
// [1,2,3,4,5,6] no rotation
//   [6,1,2,3,4,5] 1 rotation
//   [5,6,1,2,3,4] 2 rotation
//   [4,5,6,1,2,3] 3 rotation 
  
// ind  0 1 2 3 4 5
// arr[ 4,5,6,1,2,3 ] so 1 is at index 3 and that's the answer

import java.util.*;
class Main{
  public static noOFRotation(int n, int[] nums){
    int low = 0;
    int high = n - 1;
    int ans = Integer.MAX_VALUE;
    int index = -1;
    while(low <= high){
      int mid = low + (high - low)/2;
      if(nums[low] <= nums[mid]{
        if(ans > nums[low]){
          ans = nums[low];
          index = low;
        }
        low = mid + 1;
      } else{
        if(ans > nums[mid]){
          ans = nums[mid];
          index = mid ;
        }
        high = mid - 1;        
      }        
    }
    return index;
  }
  public static void main(String[] args){
    int n = 6;
    int[] nums = {1,2,3,4,5,6};
    System.out.print(noOFRotation(n, nums));
  }
}
