public class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int[] dp = new int[2];
        dp[0] = 1;
        dp[1] = 2;
        int index = 0;
        for(int i = 3; i <= n; ++i) {
            dp[index] = dp[0]+dp[1];
            index^=1;
        }
        return dp[index^1];
    }
}