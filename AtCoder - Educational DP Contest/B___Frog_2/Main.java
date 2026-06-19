//  B - Frog 2

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];

        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        int ans = solve( 0 , nums , k , dp);
        System.out.println(ans);
    }

    public static int solve(int i, int [] nums , int k , int[] dp){
        if(i == nums.length-1){
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }
        int ans = Integer.MAX_VALUE;

        for(int j = 1 ; j <= k ; j++){

            if(i + j < nums.length){
                int cost = Math.abs(nums[i + j] - nums[i]) + solve(i + j , nums , k , dp);
                ans = Math.min(ans , cost);

            }


        }
        return dp[i] = ans;


    }


}