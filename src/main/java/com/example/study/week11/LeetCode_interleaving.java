package com.example.study.week11;

import java.util.*;

//https://leetcode.com/problems/interleaving-string/
public class LeetCode_interleaving {
    public boolean isInterleave(String s1, String s2, String s3) {

        int s1length = s1.length();
        int s2length = s2.length();
        int s3length = s3.length();

        if(s1length + s2length != s3length){
            return false;
        }

        boolean dp[][] = new boolean[s1length+1][s2length+1];
        dp[0][0] = true;

        for(int i = 0; i <= s1length; i++){
            for(int j = 0; j <= s2length; j++){
                if(j > 0){
                    if(dp[i][j-1] == true && s2.charAt(j-1) == s3.charAt(i+j-1))
                        dp[i][j] = true;
                }
                if(i > 0){
                    if(dp[i-1][j] == true && s1.charAt(i-1) == s3.charAt(i+j-1))
                        dp[i][j] = true;
                }
            }
        }
        return dp[s1length][s2length];
    }

}
