// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
// Return the single element that appears only once.
// Your solution must run in O(log n) time and O(1) space.
// Example 1:
// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2
// Example 2:
// Input: nums = [3,3,7,7,10,11,11]
// Output: 10

class Solution{
  public static findonceELe(int n ,  int[] nums){
    if(n == 1) return nums[0]; // only one element then it will be returned
    if(nums[0] != nums[1]) return nums[0]; // {1,2,2,3,3} 1 != 2 and thats mean it does not have dublicate 
    if(nums[n-1] != nums[n-2]) return nums[n-1]; //{1,1,2,2,3} 3 != 2 and thats mean 3 is single
    int low = 1;
    int high = n-2;
    while(low <= high){
      int mid = low + (high - low)/2;
      if((arr[mid] != arr[mid-1]) && (arr[mid] != arr[mid + 1])){
        return arr[mid];  
        // ṭhis means that the middle element is not same as mid's left and mid's right that mean it is unique {1,1,2,3,3} then the mid is the ans
      }
      // look at the index it is in pairs of (odd, even) & (even, odd)
      if((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid -1])){
        low = mid + 1;        
    } else{
        high = mid - 1;
    }
    }
    return -1;  
    // in case no element found then return -1;
  }
  public static void main(String[] args){
    int n = 9;
    int[] nums = {1,1,2,3,3,4,4,8,8};
    System.out.println(findonceELe(n,nums));
   }
 }
