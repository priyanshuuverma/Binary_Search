// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

 

// Example 1:

// Input: piles = [3,6,7,11], h = 8
// Output: 4

class Solution {
    public int check(int mid, int[] piles) {
        int ans = 0;
        for (int pile : piles) {
            ans += (pile + mid - 1) / mid; 
        }
        return ans;
    }

    public int maxele(int[] piles) {
        int ans = 0;
        for (int pile : piles) {
            ans = Math.max(ans, pile);
        }
        return ans;
    }

    public int minEatingSpeed(int[] piles, int h) {
        if(h >= 1000000000) return 3;
        int low = 1, high = maxele(piles), ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int h2 = check(mid, piles);

            if (h2 <= h) {
                ans = mid;       
                high = mid - 1;  
            } else {
                low = mid + 1;   
            }
        }
        return low;
    }
}
