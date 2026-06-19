//  A - Frog 1

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int ans = solve( 0 , nums , dp );



        System.out.println(ans);
    }

    public static int solve(int i, int[] nums , int[] dp){
        if(i == nums.length-1){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int jump1 =
                Math.abs(nums[i] - nums[i+1])
                        + solve(i+1, nums,dp);
        int jump2 = Integer.MAX_VALUE;

        if(i + 2 < nums.length){
            jump2 =
                    Math.abs(nums[i] - nums[i+2])
                            + solve(i+2, nums,dp);
        }

        return dp[i] = Math.min(jump1, jump2);

    }
}