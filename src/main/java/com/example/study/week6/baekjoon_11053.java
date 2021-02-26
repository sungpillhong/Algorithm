package com.example.study.week6;

//https://www.acmicpc.net/problem/11053
public class baekjoon_11053 {

    public static void main(String[] args) {

        int[] arrint = new int[]{10, 20, 10, 30, 20, 50};
        int dp[] = new int[6];
        int max = 0;

        for(int i = 0; i < arrint.length; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arrint[j] < arrint[i] && dp[j] >= dp[i]){
                    dp[i] = dp[j]+1;
                }
            }
        }

        for(int i : dp){
            max = Math.max(max, i);
        }

        System.out.println(max);

    }
}

