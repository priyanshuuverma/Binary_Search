// Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
// Output: 4
// Explanation: target = 2 occurs 4 times in the given array so the output is 4.


class Solution {
    int hhigh(int[] arr, int target, int n ){
        int low = 0;
        int high = n -1;
        int last = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            } else if(arr[mid] > target){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return last;
    }
    int llow(int[] arr, int target, int n){
        int low = 0;
        int high = n - 1;
        int first = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                first= mid;
                high = mid -1;
            } else if(arr[mid] > target){
                high = mid -1;
                
            } else{
                low = mid + 1;
            }
        }
        return first;
        
    }
    int countFreq(int[] arr, int target) {
     
        int n = arr.length;
        int first = llow(arr, target,n);
        if(first == -1) return 0;
        int ans = hhigh(arr,target,n) - first + 1;
        return ans;
    }
}
