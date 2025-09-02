// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2









class Solution {
    public int mySqrt(int x) {
        long low = 1;
        long high = x;
        long ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(( mid * mid ) <= x){
                ans  = mid;
                low = mid + 1L;
            } else{
                high = mid - 1L;
            }
        }
        int an = (int)ans;
        return an;
    }
}
