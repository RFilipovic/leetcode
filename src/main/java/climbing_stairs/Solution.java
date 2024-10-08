package climbing_stairs;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        int [] memo = new int [n + 1];

        for (int i = 0; i <= n; i++)
            memo[i] = -1;

        return countSteps(n, memo);
    }

    public static int countSteps(int n, int [] memo){
        if(n == 0) return 1;
        else if(n < 0) return 0;
        if(memo[n] != -1) return memo[n];

        memo[n] = countSteps(n - 1, memo) + countSteps(n - 2, memo);
        return memo[n];
    }

}
