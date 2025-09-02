// You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then returns -1.

// Examples :

// Input: n = 3, m = 27
// Output: 3
// Explanation: 33 = 27


class Solution {
    public long f(long mid , int n ){
        long ans = 1;
        int i =1;
        while(i<= n){
            ans *= mid;
            i++;
        }
        return ans;
    }
    public int nthRoot(int n, int m) {
        long low = 0;
        long high = m;
        while(low <= high){
            long mid = low + (high - low)/2;
            long p = f(mid, n);
            if(p > m) high = mid - 1L;
            else if ( p < m) low = mid + 1L;
            else {
                return (int)mid;
            }
        }
        return -1;
    }
}
